package com.example.dh1.integrador.Model.DAO;

import com.example.dh1.integrador.Model.POJO.Card;
import com.example.dh1.integrador.Utils.ResultListener;

import java.util.List;

/**
 * Created by dh1 on 15/06/17.
 */

public class DaoCardInternet {
    // ASINCRONO
    public void getCardListFromInternet
    (ResultListener<List<Card>> controllerListener){
        Tarea tarea = new Tarea(controllerListener);
        tarea.execute("https://api.pokemontcg.io/v1/cards?page=1&pageSize=15");
    }
}
