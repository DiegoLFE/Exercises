package com.example.dh1.basesdedatos.Model.POJO;

/**
 * Created by dh1 on 14/06/17.
 */

public class Persona {
    private Integer id;
    private String nombre;
    private String lastTweet;

    public Persona(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLastTweet() {
        return lastTweet;
    }

    public void setLastTweet(String lastTweet) {
        this.lastTweet = lastTweet;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", lastTweet='" + lastTweet + '\'' +
                '}';
    }
}
