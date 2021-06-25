package com.digitalhouse.navigationdrawer;

public class Restaurant {
    private String name;
    private String descripcion;
    private Integer imagen;

    public Restaurant(String name, String descripcion, Integer imagen) {
        this.name = name;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getName() {
        return name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getImagen() {
        return imagen;
    }
}

