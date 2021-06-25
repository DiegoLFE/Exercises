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

/**
 * Created by digitalhouse on 01/06/17.
 */

public class DAOProducto {

    //Creo un método para pedir la lista de productos del archivo Json
    public List<Producto> getListaDeProductosFromArchivo(Context context){
        List<Producto> listaDeProductos = new ArrayList<>();

        //Pedimos el assetManager para acceder a los archivos dentro de la carpeta assets
        AssetManager assetManager = context.getAssets();
        try {
            //Creamos un stream para leer el archivo Json.
            InputStream archivoJsonProductos = assetManager.open("listadeproductos.json");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(archivoJsonProductos));

            //Creamos un Objeto de la clase Gson que me permitirá sencillamente parsear el Json.
            Gson gson = new Gson();

            //Utilizando el objeto gson y el método fromJson, realizamos el parsing el archivo
            // que tenemos en el bufferReaderIn y utilizando como “molde” la clase ProductoContainer.
            ProductoContainer productoContainer = gson.fromJson(bufferedReader, ProductoContainer.class);
            listaDeProductos = productoContainer.getListaDeProductos();

        } catch (IOException e) {
            e.printStackTrace();
        }
        //Devuelvo la lista cargada
        return listaDeProductos;
    }

}
