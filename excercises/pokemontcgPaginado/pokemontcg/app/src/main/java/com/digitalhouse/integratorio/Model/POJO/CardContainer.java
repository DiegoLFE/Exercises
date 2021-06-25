package com.digitalhouse.integratorio.Model.POJO;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 14/06/17.
 */

public class CardContainer {
    @SerializedName("cards")
    private List<Card> cards = new ArrayList<>();

    public List<Card> getCards() {
        return cards;
    }
}
