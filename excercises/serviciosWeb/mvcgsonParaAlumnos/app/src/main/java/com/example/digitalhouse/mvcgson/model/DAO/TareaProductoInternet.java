package com.example.digitalhouse.mvcgson.model.DAO;

import android.os.AsyncTask;

import com.example.digitalhouse.mvcgson.model.POJO.Producto;
import com.example.digitalhouse.mvcgson.model.POJO.ProductoContainer;
import com.example.digitalhouse.util.DAOException;
import com.example.digitalhouse.util.HTTPConnectionManager;
import com.example.digitalhouse.util.ResultListener;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TareaProductoInternet extends AsyncTask<String, Void, List<Producto>> {
    private ResultListener<List<Producto>> listenerControllerCalamardo;

    protected TareaProductoInternet(ResultListener<List<Producto>> listenerControllerCalamardo) {
        this.listenerControllerCalamardo = listenerControllerCalamardo;
    }

    @Override
    protected List<Producto> doInBackground(String[] params) {
        List<Producto> productoList = new ArrayList<>();
        String url = params[0];

        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        HTTPConnectionManager httpConnectionManager = null;

        try {
            //Pedir a Internet json
            httpConnectionManager = new HTTPConnectionManager();
            inputStream = httpConnectionManager.getRequestStream(url);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            //Pedir a GSON que parsee el json
            Gson gson = new Gson();
            ProductoContainer objetoContenedor = gson.fromJson(bufferedReader, ProductoContainer.class);
            productoList = objetoContenedor.getListaDeProductos();

        } catch (DAOException e) {
            // Cierro el buffer
            e.printStackTrace();
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                } else if (inputStream != null) {
                    inputStream.close();
                }

            } catch (IOException e2) {
                e2.printStackTrace();
            }

            // Cierro la conexion
            httpConnectionManager.closeConnection();
        }

        return productoList;
    }


    @Override
    protected void onPostExecute(List<Producto> resultado) {
        // Aviso al Controller(Calamardo) que el objetoContainer ya esta listo
        listenerControllerCalamardo.finish(resultado);
    }
}