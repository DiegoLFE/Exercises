package com.example.digitalhouse.listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Personaje> listaDePersonajes = new ArrayList<>();
        listaDePersonajes.add(new Personaje("Bart Simpson", "Andar en patineta"));
        listaDePersonajes.add(new Personaje("Spiderman", "Saltar en telaraña"));
        listaDePersonajes.add(new Personaje("Rambo", "Matar a todos"));
        listaDePersonajes.add(new Personaje("Thor", "Lanzamiento de martillo"));
        listaDePersonajes.add(new Personaje("Cenicienta", "Limpiar vajilla"));
        listaDePersonajes.add(new Personaje("Bart Simpson", "Andar en patineta"));
        listaDePersonajes.add(new Personaje("Spiderman", "Saltar en telaraña"));
        listaDePersonajes.add(new Personaje("Rambo", "Matar a todos"));
        listaDePersonajes.add(new Personaje("Thor", "Lanzamiento de martillo"));
        listaDePersonajes.add(new Personaje("Cenicienta", "Limpiar vajilla"));

        ListView listView = (ListView)findViewById(R.id.listViewPersonajes);

        MiAdaptadorDePersonajes miAdapter = new MiAdaptadorDePersonajes(this, listaDePersonajes);


        listView.setAdapter(miAdapter);


    }
}
