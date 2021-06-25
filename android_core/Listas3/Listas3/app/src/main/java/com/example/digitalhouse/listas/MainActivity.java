package com.example.digitalhouse.listas;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Personaje> listaDePersonajes;
    private MiAdaptadorDePersonajes miAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creo mis Datos
        listaDePersonajes = new ArrayList<>();
        listaDePersonajes.add(new Personaje("Bart Simpson", "Andar en patineta", R.drawable.bart));
        listaDePersonajes.add(new Personaje("Spiderman", "Saltar en telaraña", R.drawable.spiderman));
        listaDePersonajes.add(new Personaje("Rambo", "Matar a todos", R.drawable.rambo));
        listaDePersonajes.add(new Personaje("Thor", "Lanzamiento de martillo", R.drawable.thor));
        listaDePersonajes.add(new Personaje("Cenicienta", "Limpiar vajilla", R.drawable.cenicienta));
        listaDePersonajes.add(new Personaje("Bart Simpson", "Andar en patineta", R.drawable.bart));
        listaDePersonajes.add(new Personaje("Spiderman", "Saltar en telaraña", R.drawable.spiderman));
        listaDePersonajes.add(new Personaje("Rambo", "Matar a todos", R.drawable.rambo));
        listaDePersonajes.add(new Personaje("Thor", "Lanzamiento de martillo", R.drawable.thor));
        listaDePersonajes.add(new Personaje("Cenicienta", "Limpiar vajilla", R.drawable.cenicienta));

        // Busco la listView de la vista
        ListView listView = (ListView)findViewById(R.id.listViewPersonajes);

        // Creo mi adaptador y le paso los datos
        miAdapter = new MiAdaptadorDePersonajes(this, listaDePersonajes);

        // Enchufo el adaptador en la lista.
        listView.setAdapter(miAdapter);

        ListenerPersonajes listenerPersonajes = new ListenerPersonajes();
        listView.setOnItemClickListener(listenerPersonajes);


        // Busco el Boton Agregar de la vista
        Button button = (Button)findViewById(R.id.buttonAgregar);
        // Le asocio un listener que se ejecutara al oprimir el botón.
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editTextAgregar);
                String texto = editText.getText().toString();
                Personaje personaje = new Personaje(texto, "Salva el mundo", R.drawable.none);

                listaDePersonajes.add(personaje);
                miAdapter.notifyDataSetChanged();
            }
        });

    }
}
