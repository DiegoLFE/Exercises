package com.example.digitalhouse.persondatabase.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by digitalhouse on 12/06/17.
 */

public class PersonContainer {

    @SerializedName("result")
    private List<Person> personList;

    public List<Person> getPersonList() {
        return personList;
    }
}
