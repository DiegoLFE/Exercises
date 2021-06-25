package com.example.digitalhouse.mvcgson.model.DAO;


import com.example.digitalhouse.mvcgson.model.POJO.Producto;
import com.example.digitalhouse.util.ResultListener;

import java.util.List;


// BOB ESPONJA
public class DAOProductoInternet {
    public void getListaDeProductosFromInternet(final ResultListener<List<Producto>> listenerControllerCalamardo) {
        TareaProductoInternet tarea = new TareaProductoInternet(listenerControllerCalamardo);
        tarea.execute("http://api.myjson.com/bins/rxlcd");
    }
}
