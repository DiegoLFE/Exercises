package com.example.digitalhouse.mvcjsonguiado.v2Refactor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 24/05/17.
 */

public class DAOProductoInternet {

    public List<Producto> obtenerProductosDeInternet(){

        List<Producto>productos = new ArrayList<>();
        productos.add(new Producto("Celular","Android",10000.0));
        return productos;
    }

}
