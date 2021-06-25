package com.example.digitalhouse.listas;

/**
 * Created by digitalhouse on 27/04/17.
 */

public class Personaje {
    private String nombre;
    private String superPoder;

    public Personaje(String nombre, String superPoder){
        this.nombre = nombre;
        this.superPoder = superPoder;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSuperPoder() {
        return superPoder;
    }
}
