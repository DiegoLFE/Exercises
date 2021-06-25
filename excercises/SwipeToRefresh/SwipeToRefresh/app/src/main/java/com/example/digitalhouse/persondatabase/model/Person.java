package com.example.digitalhouse.persondatabase.model;

/**
 * Created by digitalhouse on 10/06/17.
 */

public class Person {

    private Integer id;
    private String name;
    private String lastTweet;

    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastTweet() {
        return lastTweet;
    }

    public void setLastTweet(String lastTweet) {
        this.lastTweet = lastTweet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastTweet='" + lastTweet + '\'' +
                '}';
    }
}


