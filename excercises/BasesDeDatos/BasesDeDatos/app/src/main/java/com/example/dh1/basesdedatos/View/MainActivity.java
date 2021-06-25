package com.example.dh1.basesdedatos.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dh1.basesdedatos.Controller.ControllerPersona;
import com.example.dh1.basesdedatos.Model.DAO.DAOPersonaDatabase;
import com.example.dh1.basesdedatos.Model.POJO.Persona;
import com.example.dh1.basesdedatos.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Persona persona1 = new Persona();
        persona1.setId(1);
        persona1.setNombre("Pedro");
        persona1.setLastTweet("El Digital-Summit estuvo genial.");

        ControllerPersona controllerPersona = new ControllerPersona();
        controllerPersona.addPersona(this, persona1);

    }
}
