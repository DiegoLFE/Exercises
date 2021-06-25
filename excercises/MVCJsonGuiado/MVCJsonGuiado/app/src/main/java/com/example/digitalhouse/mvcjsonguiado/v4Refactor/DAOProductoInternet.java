package com.example.digitalhouse.mvcjsonguiado.v4Refactor;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 24/05/17.
 */

public class DAOProductoInternet {
    public List<Producto> obtenerProductosDeInternet(){
        List<Producto>productos = null;
        //Obtengo algun objeto que me permite hacer comunicaciones con Internet
        //Le pido que se conecte con Mercado Abierto
        //esto me devuelve un choclo de texto con tota la informacion
        //tengo que pasarla a una lista de productos y luego devolverla
        productos = new ArrayList<>();
        productos.add(new Producto("PS4","La ultima PlayStation, diversion asegurada",12000.0));
        productos.add(new Producto("PS3","La ante-ultima PlayStation, diversion casi-asegurada",12000.0));
        productos.add(new Producto("PS2","La segunda PlayStation, diversion notan-asegurada",12000.0));
        productos.add(new Producto("PS1","La primer Play, diversion solo para entendidos",12000.0));

        return productos;
    }
}
