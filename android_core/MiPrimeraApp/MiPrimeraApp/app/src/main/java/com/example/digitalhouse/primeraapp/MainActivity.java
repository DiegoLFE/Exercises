package com.example.digitalhouse.primeraapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencio a mi textView en el Layout
        TextView textViewBienvenida = (TextView) findViewById(R.id.textViewBienvenida);

        //Seteo un color de texto a mi textView
        textViewBienvenida.setTextColor(Color.GREEN);

        //Hago un Toast con el contenido del textViewBienvenida
        Toast.makeText(this, textViewBienvenida.getText(), Toast.LENGTH_SHORT).show();
    }

    //Creo el metodo que se va a ejecutar cuando se presione el botón
    public void ejecutarCodigoClickBoton(View view){

        //Referencio a mi editText en el layout
        EditText editTextNombre = (EditText) findViewById(R.id.editTextNombre);

        //Guardo el texto del editText en un string
        String nombre = editTextNombre.getText().toString();

        //Hago un Toast con el contenido del editTextNombre
        Toast.makeText(this, "Bienvenid@: " + nombre , Toast.LENGTH_SHORT).show();
    }
}
