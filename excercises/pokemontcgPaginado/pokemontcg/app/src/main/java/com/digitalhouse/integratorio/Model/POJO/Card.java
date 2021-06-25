package com.digitalhouse.integratorio.Model.POJO;

import com.google.gson.annotations.SerializedName;

/**
 * Created by digitalhouse on 14/06/17.
 */

public class Card {
    @SerializedName("imageUrlHiRes")
    private String imageUrl;
    private Integer ids;

    public Card(String imageUrl){
        this.imageUrl = imageUrl;
    }

    public void setId(Integer id) {
        this.ids = id;
    }

    public Integer getId() {
        return ids;
    }

    public String getImage() {
        return imageUrl;
    }

    @Override
    public boolean equals(Object obj) {
        Card otherCard = (Card) obj;
        return this.imageUrl.equals(otherCard.getImage());
    }

    @Override
    public String toString() {
        return "Card{" +
                "imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
