package com.example.dh1.integrador.Model.POJO;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dh1 on 15/06/17.
 */

public class Card {
    private String id;
    @SerializedName("imageUrlHiRes")
    private String imageUrl;

    public Card(String id, String imageUrl){
        this.id = id;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
