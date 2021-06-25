package com.digitalhouse.integratorio.Model.DAO;

import com.digitalhouse.integratorio.Model.POJO.Card;
import com.digitalhouse.integratorio.Model.POJO.CardContainer;
import com.digitalhouse.integratorio.Util.DAOException;
import com.digitalhouse.integratorio.Util.HTTPConnectionManager;
import com.digitalhouse.integratorio.Util.ResultListener;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 14/06/17.
 */

public class AsyncTask extends android.os.AsyncTask<String, Void, List<Card>> {
    private ResultListener<List<Card>> controllerListener;

    public AsyncTask(ResultListener<List<Card>> controllerListener){
        this.controllerListener = controllerListener;
    }

    @Override
    protected List<Card> doInBackground(String... params) {
        List<Card> cardList = new ArrayList<>();

        String url = params[0];

        HTTPConnectionManager httpConnectionManager = new HTTPConnectionManager();
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            inputStream = httpConnectionManager.getRequestStream(url);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            Gson gson = new Gson();
            CardContainer cardContainer = gson.fromJson(bufferedReader, CardContainer.class);
            cardList = cardContainer.getCards();


        } catch (DAOException e){
           e.printStackTrace();
        } finally {

            // Trato de cerrar el buffer reader
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e2){
                e2.printStackTrace();
                // Si no pude cerrarlo, trato de cerrar el input stream
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e3){
                    e3.printStackTrace();
                }
            }

            // cierro la conexion
            httpConnectionManager.closeConnection();
        }


        return cardList;
    }

    @Override
    protected void onPostExecute(List<Card> cardList) {
        controllerListener.finish(cardList);
    }
}
