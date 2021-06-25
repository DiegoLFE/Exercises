package com.example.dh1.basesdedatos.Controller;

import android.content.Context;

import com.example.dh1.basesdedatos.Model.DAO.DAOPersonaDatabase;
import com.example.dh1.basesdedatos.Model.POJO.Persona;

/**
 * Created by dh1 on 14/06/17.
 */

public class ControllerPersona {

    public void addPersona(Context context, Persona persona) {
        DAOPersonaDatabase personaDatabase = new DAOPersonaDatabase(context);
        personaDatabase.addPersona(persona);
    }
}
