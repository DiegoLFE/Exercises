package com.example.dh1.comunicacionentreapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Enviador extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cambiarDeActivity(View view){
        // Creo el Intent (Mensaje)
        Intent unIntent = new Intent(this, Receptor.class);

        // Creo el bundle (Regalo Misterioso)
        Bundle unBundle = new Bundle();
        // Lleno el bundle (Regalo Misterioso)
        unBundle.putInt(Receptor.CLAVE_TIPO, 4);
        unBundle.putString(Receptor.CLAVE_CONSOLA, "PlayStation");

        // Adjunto el bundle (Regalo Misterioso) al Intent (Mensaje)
        unIntent.putExtras(unBundle);

        // Mando el Intent (Envio el mensaje)
        startActivity(unIntent);
    }
}
