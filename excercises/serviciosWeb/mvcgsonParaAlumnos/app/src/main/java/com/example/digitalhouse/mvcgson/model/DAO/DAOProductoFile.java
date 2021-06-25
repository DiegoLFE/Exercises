package com.example.digitalhouse.mvcgson.model.DAO;

import android.content.Context;
import android.content.res.AssetManager;

import com.example.digitalhouse.mvcgson.model.POJO.Producto;
import com.example.digitalhouse.mvcgson.model.POJO.ProductoContainer;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class DAOProductoFile {

    //Creo un método para pedir la lista de productos del archivo Json
    public List<Producto> getListaDeProductosFromArchivo(Context context){
        List<Producto> listaDeProductos = new ArrayList<>();

        //Pedimos el assetManager para acceder a los archivos dentro de la carpeta assets
        AssetManager assetManager = context.getAssets();
        InputStream archivoJsonProductos = null;
        BufferedReader bufferedReader = null;

        try {
            //Creamos un stream para leer el archivo Json.
            archivoJsonProductos = assetManager.open("listadeproductos.json");
            bufferedReader = new BufferedReader(new InputStreamReader(archivoJsonProductos));

            //Creamos un Objeto de la clase Gson que me permitirá sencillamente parsear el Json.
            Gson gson = new Gson();

            //Utilizando el objeto gson y el método fromJson, realizamos el parsing el archivo
            // que tenemos en el bufferReaderIn y utilizando como “molde” la clase ProductoContainer.
            ProductoContainer productoContainer = gson.fromJson(bufferedReader, ProductoContainer.class);

            // Devuelvo la lista de productos
            listaDeProductos = productoContainer.getListaDeProductos();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Cierro el Buffer
                if (bufferedReader != null) {
                    bufferedReader.close();
                } else if (archivoJsonProductos != null) {
                    archivoJsonProductos.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        //Devuelvo null si no se pudo leer el archivo
        return listaDeProductos;
    }
}
