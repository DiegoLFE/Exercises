package com.example.dh1.integrador.Model.DAO;

import android.os.AsyncTask;

import com.example.dh1.integrador.Model.POJO.Card;
import com.example.dh1.integrador.Model.POJO.CardContainer;
import com.example.dh1.integrador.Utils.DAOException;
import com.example.dh1.integrador.Utils.HTTPConnectionManager;
import com.example.dh1.integrador.Utils.ResultListener;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dh1 on 15/06/17.
 */

public class Tarea extends AsyncTask<String,Void,List<Card>>{
    private ResultListener<List<Card>> controllerListener;

    public Tarea(ResultListener<List<Card>> controllerListener){
        this.controllerListener = controllerListener;
    }

    @Override
    protected List<Card> doInBackground(String... params) {
        String url = params[0];
        List<Card> cardList = new ArrayList<>();

        // CREE LA CONEXION A INTERNET
        HTTPConnectionManager httpConnectionManager = new HTTPConnectionManager();
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;

        try{
            inputStream = httpConnectionManager.getRequestStream(url);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            Gson gson = new Gson();
            CardContainer cardContainer = gson.fromJson(bufferedReader, CardContainer.class);
            cardList = cardContainer.getCards();
        } catch (DAOException e){
            e.printStackTrace();
        } finally {
            // CLOSE BUFFERREADER Y INPUT STREAM READER
            try {
                bufferedReader.close();
            } catch (IOException e1){
                e1.printStackTrace();
                try{
                    inputStream.close();
                } catch (IOException e2){
                    e2.printStackTrace();
                }
            }

            // CERRAR LA CONEXION
            httpConnectionManager.closeConnection();
        }

        return cardList;
    }

    @Override
    protected void onPostExecute(List<Card> cards) {
        super.onPostExecute(cards);
        controllerListener.finish(cards);
    }
}
