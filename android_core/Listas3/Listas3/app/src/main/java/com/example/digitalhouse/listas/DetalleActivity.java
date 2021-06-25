package com.example.digitalhouse.listas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {
    public static final String CLAVE_NOMBRE = "claveNombre";
    public static final String CLAVE_SUPERPODER = "claveSuperpoder";
    public static final String CLAVE_FOTO = "claveFoto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        // Busco el Intent
        Intent unIntent = getIntent();
        // Extraigo el Bundle
        Bundle unBundle = unIntent.getExtras();

        // Extraigo los datos con las claves
        String nombre = unBundle.getString(CLAVE_NOMBRE);
        String superpoder = unBundle.getString(CLAVE_SUPERPODER);
        Integer fotoResource = unBundle.getInt(CLAVE_FOTO);

        // Busco los componentes del Layout
        TextView textViewNombre = (TextView) findViewById(R.id.textViewNombrePersonajeDetalle);
        TextView textViewSuperpoder = (TextView) findViewById(R.id.textViewSuperPoderPersonajeDetalle);
        ImageView imageViewPersonaje = (ImageView) findViewById(R.id.imageViewPersonajeDetalle);

        // Seteo los datos a los componentes
        textViewNombre.setText(nombre);
        textViewSuperpoder.setText(superpoder);
        imageViewPersonaje.setImageResource(fotoResource);

    }



}
