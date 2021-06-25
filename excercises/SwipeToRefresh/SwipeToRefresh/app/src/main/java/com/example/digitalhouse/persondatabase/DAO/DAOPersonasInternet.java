package com.example.digitalhouse.persondatabase.DAO;

import android.os.AsyncTask;

import com.example.digitalhouse.persondatabase.model.Person;
import com.example.digitalhouse.persondatabase.model.PersonContainer;
import com.example.digitalhouse.persondatabase.utils.DAOException;
import com.example.digitalhouse.persondatabase.utils.HTTPConnectionManager;
import com.example.digitalhouse.persondatabase.utils.ResultListener;
import com.google.gson.Gson;

import java.util.List;

/**
 * Created by digitalhouse on 12/06/17.
 */

public class DAOPersonasInternet {

    public void getPersonsFromInternet(ResultListener<List<Person>> listenerController){

        RetrievePersonsTask unRetrievePersonsTask = new RetrievePersonsTask();
        unRetrievePersonsTask.setListenerController(listenerController);
        unRetrievePersonsTask.execute();

    }

    class RetrievePersonsTask extends AsyncTask<String,Void,List<Person>> {
        private ResultListener<List<Person>> listenerController;

        public void setListenerController(ResultListener<List<Person>> listenerController) {
            this.listenerController = listenerController;
        }

        @Override
        protected List<Person> doInBackground(String... params) {
            try {
                HTTPConnectionManager httpConnectionManager = new HTTPConnectionManager();
                String stringJSON = httpConnectionManager.getRequestString("https://api.myjson.com/bins/qixcr");

                Gson gson = new Gson();
                PersonContainer personContainer = gson.fromJson(stringJSON, PersonContainer.class);

                return personContainer.getPersonList();

            } catch (DAOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(List<Person> persons) {
            listenerController.finish(persons);
        }
    }
}
