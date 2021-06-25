package com.example.digitalhouse.listas;

/**
 * Created by digitalhouse on 27/04/17.
 */

public class Personaje {
    private String nombre;
    private String superPoder;
    private Integer fotoResource;

    public Personaje(String nombre, String superPoder, Integer fotoResource){
        this.nombre = nombre;
        this.superPoder = superPoder;
        this.fotoResource = fotoResource;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSuperPoder() {
        return superPoder;
    }

    public Integer getFotoResource() {
        return fotoResource;
    }
}
