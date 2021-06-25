package com.digitalhouse.integratorio.Model.DAO;

import com.digitalhouse.integratorio.Model.POJO.Card;
import com.digitalhouse.integratorio.Util.ResultListener;

import java.util.List;

/**
 * Created by digitalhouse on 14/06/17.
 */

public class DaoCardInternet {

    public void getCardListFromInternet(ResultListener<List<Card>> controllerListener, Integer page, Integer pageSize){
            AsyncTask asyncTask = new AsyncTask(controllerListener);
            asyncTask.execute("https://api.pokemontcg.io/v1/cards?page=" + page + "&pageSize=" + pageSize);
    }

}