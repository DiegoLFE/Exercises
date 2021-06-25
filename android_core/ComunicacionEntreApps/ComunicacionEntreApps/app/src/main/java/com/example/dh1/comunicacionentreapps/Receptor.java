package com.example.dh1.comunicacionentreapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Receptor extends AppCompatActivity {
    // Defino los campos que me interesan recibir como atributos.
    // public : publico
    // static : es único en la clase
    // final  : constante

    public static final String CLAVE_CONSOLA = "claveConsola";
    public static final String CLAVE_TIPO = "claveTipo";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);

        // Pido el Intent (Mensaje)
        Intent unIntent = getIntent();
        // Extraigo el bundle (Regalo Misterioso)
        Bundle unBundle = unIntent.getExtras();
        // Extraigo los campos que me interesan
        String consola = unBundle.getString(CLAVE_CONSOLA);
        Integer version = unBundle.getInt(CLAVE_TIPO);

        //Imprimo los valores que recibí.
        Toast.makeText(this, consola + " " + version, Toast.LENGTH_SHORT).show();

    }
}
