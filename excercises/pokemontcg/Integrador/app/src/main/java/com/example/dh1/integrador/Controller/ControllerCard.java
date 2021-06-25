package com.example.dh1.integrador.Controller;

import android.content.Context;
import android.widget.Toast;

import com.example.dh1.integrador.Model.DAO.DaoCardDatabase;
import com.example.dh1.integrador.Model.DAO.DaoCardInternet;
import com.example.dh1.integrador.Model.POJO.Card;
import com.example.dh1.integrador.Utils.HTTPConnectionManager;
import com.example.dh1.integrador.Utils.ResultListener;

import java.util.List;

/**
 * Created by dh1 on 15/06/17.
 */

public class ControllerCard {

    //Asincrono
    public void getListCard(final Context context, final ResultListener<List<Card>>  viewListener){

        if (HTTPConnectionManager.isNetworkingOnline(context)){
            // PEDIRLO A INTERNET
            DaoCardInternet daoCardInternet = new DaoCardInternet();
            daoCardInternet.getCardListFromInternet(new ResultListener<List<Card>>() {
                @Override
                public void finish(List<Card> resultado) {
                    // ACA LLEGA LO DE INTERNET
                    DaoCardDatabase daoCardDatabase = new DaoCardDatabase(context);
                    daoCardDatabase.addListCard(resultado);

                    viewListener.finish(resultado);
                }
            });

        } else {
            // PEDIRLO A LA BASE DE DATOS
            DaoCardDatabase daoCardDatabase = new DaoCardDatabase(context);
            List<Card> cards = daoCardDatabase.getListCardInDatabase();
            Toast.makeText(context, cards.toString(), Toast.LENGTH_LONG).show();
            viewListener.finish(cards);
        }

    }
}
