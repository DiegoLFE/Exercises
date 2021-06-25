package com.example.digitalhouse.mercadoabierto;

/**
 * Created by digitalhouse on 25/04/17.
 */

public class Articulo {

    private String descripcion;
    private Integer precio;
    private Integer imagen;

    public Articulo(String descripcion, Integer precio, Integer imagen) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }
}
