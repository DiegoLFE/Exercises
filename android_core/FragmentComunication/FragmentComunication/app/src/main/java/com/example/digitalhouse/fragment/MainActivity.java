package com.example.digitalhouse.fragment;


import android.support.v4.app.Fragment;
import android.content.Intent;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment1.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creo el fragment
        Fragment unFragment = new Fragment1();
        // Pido el fragment manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Pido una transaccion
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // Agrego el fragment en el contenedor
        fragmentTransaction.add(R.id.rootMainActivity, unFragment);
        // Ejecuto la transaccion
        fragmentTransaction.commit();
    }

    @Override
    public void onFragmentInteraction(String mensaje) {
        // Creo el Intent con el contexto de la activity
        Intent unIntent = new Intent(this, DetailActivity.class);
        // Creo el Bundle
        Bundle unBundle = new Bundle();
        // Lleno el Bundle
        unBundle.putString(Fragment2.CLAVE_MENSAJE, mensaje);
        // Asocio el Bundle al Intent
        unIntent.putExtras(unBundle);
        // Envio el Intent y pido por la segunda activity
        startActivity(unIntent);
    }
}
