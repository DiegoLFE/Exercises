package com.example.digitalhouse.mvcgson.controller;

import android.content.Context;

import com.example.digitalhouse.mvcgson.model.DAO.DAOProducto;
import com.example.digitalhouse.mvcgson.model.POJO.Producto;

import java.util.List;

/**
 * Created by digitalhouse on 01/06/17.
 */

public class ControllerProducto {

    //Creo un método para pedir la lista de productos al DAO
    public List<Producto> getListaDeProductos(Context context){
        //Llamo a un DAO
        DAOProducto daoProducto = new DAOProducto();
        //Le pido la lista de productos
        List<Producto> listaDeProductos = daoProducto.getListaDeProductosFromArchivo(context);
        //Devuelvo la lista
        return listaDeProductos;
    }
}
