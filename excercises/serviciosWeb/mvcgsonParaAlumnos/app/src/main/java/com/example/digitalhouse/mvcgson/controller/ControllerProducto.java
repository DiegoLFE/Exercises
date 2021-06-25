package com.example.digitalhouse.mvcgson.controller;

import android.content.Context;

import com.example.digitalhouse.mvcgson.model.DAO.DAOProductoFile;
import com.example.digitalhouse.mvcgson.model.DAO.DAOProductoInternet;
import com.example.digitalhouse.mvcgson.model.POJO.Producto;
import com.example.digitalhouse.mvcgson.model.POJO.ProductoContainer;
import com.example.digitalhouse.util.ResultListener;

import java.util.List;

// CALAMARDO
public class ControllerProducto{

    //Creo un método para pedir la lista de productos al DAO
    public void getListaDeProductos(Context context, final ResultListener<List<Producto>> listenerViewPatricio){
        if (hasInternet()){

            //Listener del Controller (Calamardo)
            ResultListener<List<Producto>> listenerControllerCalamardo = new ResultListener<List<Producto>>() {
                @Override
                public void finish(List<Producto> resultado) {
                    // El dao(Bob Esponja) me devuelve la lista de productos una vez cocinada
                    // Se la paso al activity.
                    listenerViewPatricio.finish(resultado);
                }
            };


            // ASINCRONO
            DAOProductoInternet daoInternet = new DAOProductoInternet();
            daoInternet.getListaDeProductosFromInternet(listenerControllerCalamardo);

        } else {
            // SINCRONO
            DAOProductoFile daoFile = new DAOProductoFile();
            List<Producto> listaDeProductosFromArchivo = daoFile.getListaDeProductosFromArchivo(context);
            listenerViewPatricio.finish(listaDeProductosFromArchivo);
        }

    }

    public Boolean hasInternet(){
        return true;
    }
}
