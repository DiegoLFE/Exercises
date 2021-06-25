package com.example.digitalhouse.mercadoabierto;

/**
 * Created by digitalhouse on 03/05/17.
 */

public class Producto {
    private String nombre;
    private Integer precio;
    private Integer foto;

    public Producto(String nombre, Integer precio, Integer foto) {
        this.nombre = nombre;
        this.precio = precio;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public Integer getFoto() {
        return foto;
    }
}
