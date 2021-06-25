package com.example.digitalhouse.sumadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sumar (View view){
        //Busco el textView en el layout
        TextView textViewContador = (TextView) findViewById(R.id.textViewContador);
        //Guardo el contenido del textView en una variable de tipo String
        String numeroActual = textViewContador.getText().toString();
        //Convierto el texto a Integer y lo guardo en una variable de tipo Integer
        Integer numero = Integer.parseInt(numeroActual);
        //Sumo
        numero++;
        //Seteo el numero sumado al textView
        textViewContador.setText(numero.toString());
    }

    public void restar(View view){
        //Busco el textView en el layout
        TextView textViewContador = (TextView) findViewById(R.id.textViewContador);
        //Guardo el contenido del textView en una variable de tipo String
        String numeroActual = textViewContador.getText().toString();
        //Convierto el texto a Integer y lo guardo en una variable de tipo Integer
        Integer numero = Integer.parseInt(numeroActual);
        //Resto
        numero++;
        //Seteo el numero sumado al textView
        textViewContador.setText(numero.toString());
    }
}
