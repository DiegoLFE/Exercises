package com.example.dh2.listview;

/**
 * Created by dh2 on 26/04/17.
 */

public class Personaje {

    private String nombre;
    private String superpoder;
    private Integer imagenId;

    public Personaje(String nombre, String superpoder, Integer imagenId) {
        this.nombre = nombre;
        this.superpoder = superpoder;
        this.imagenId = imagenId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSuperpoder() {
        return superpoder;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personaje)) return false;

        Personaje personaje = (Personaje) o;

        return nombre != null ? nombre.equalsIgnoreCase(personaje.nombre) : personaje.nombre == null;

    }

    public Integer getImagenId() {
        return imagenId;
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }
}
