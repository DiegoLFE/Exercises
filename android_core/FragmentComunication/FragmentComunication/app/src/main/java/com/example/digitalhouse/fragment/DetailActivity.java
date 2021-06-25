package com.example.digitalhouse.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Recibo el Intent
        Intent unIntent = getIntent();
        // Extraigo el Bundle
        Bundle unBundle = unIntent.getExtras();

        // Creo el Fragment
        Fragment unFragment2 = new Fragment2();
        // Le paso el Bundle al Fragment por Argumentos
        unFragment2.setArguments(unBundle);

        // Pido el fragment manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Pido una transaccion
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // Agrego el fragment en el contenedor
        fragmentTransaction.add(R.id.rootSecondActivity, unFragment2);
        // Ejecuto la transaccion
        fragmentTransaction.commit();
    }
}
