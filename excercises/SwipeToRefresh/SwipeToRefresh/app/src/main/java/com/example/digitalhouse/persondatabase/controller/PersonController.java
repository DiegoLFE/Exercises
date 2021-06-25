package com.example.digitalhouse.persondatabase.controller;

import android.content.Context;
import android.widget.Toast;

import com.example.digitalhouse.persondatabase.DAO.DAOPersonDatabase;
import com.example.digitalhouse.persondatabase.DAO.DAOPersonasInternet;
import com.example.digitalhouse.persondatabase.model.Person;
import com.example.digitalhouse.persondatabase.utils.HTTPConnectionManager;
import com.example.digitalhouse.persondatabase.utils.ResultListener;

import java.util.List;

/**
 * Created by digitalhouse on 10/06/17.
 */

public class PersonController {

    private Context context;

    public PersonController(Context context) {
        this.context = context;
    }


    public void obtenerListaDePersonas(final ResultListener<List<Person>> resultListenerFromView) {


      if(HTTPConnectionManager.isNetworkingOnline(context)) {
          DAOPersonasInternet daoPersonasInternet = new DAOPersonasInternet();
          daoPersonasInternet.getPersonsFromInternet(new ResultListener<List<Person>>() {
              @Override
              public void finish(List<Person> persons) {

                  //GUARDO EN LA BASE DE DATOS LA LISTA QUE TRAJE DE INTERNET
                  DAOPersonDatabase daoPersonDatabase = new DAOPersonDatabase(context);
                  daoPersonDatabase.addPersons(persons);

                  resultListenerFromView.finish(persons);
              }
          });
          Toast.makeText(context, "Estoy con internet", Toast.LENGTH_SHORT).show();
      }
      else {

          DAOPersonDatabase daoPersonDatabase = new DAOPersonDatabase(context);
          List<Person> persons = daoPersonDatabase.getAllPersons();
          resultListenerFromView.finish(persons);
          Toast.makeText(context, "Estoy con la base", Toast.LENGTH_SHORT).show();
      }
    }
}
