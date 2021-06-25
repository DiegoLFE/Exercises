package com.example.digitalhouse.mvcgson.model.POJO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by digitalhouse on 01/06/17.
 */

public class ProductoContainer {

    /* Si el nombre de mi atributo no quiero hacerlo coincidir
    con el que viene en el Json, agrego un SerializedName
    que si coincida con el nombre que está en el json y a mi atributo le pongo el nombre que quiero */
    @SerializedName("productos")
    private List<Producto> listaDeProductos;


    public List<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(List<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }
}
