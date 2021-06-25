package com.example.digitalhouse.mercadoabierto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);
        ArticulosAdapter articulosAdapter = new ArticulosAdapter();
        articulosAdapter.setContext(MainActivity.this);
        articulosAdapter.setArticulos(cargarArticulos());
        listView.setAdapter(articulosAdapter);



    }

    private List<Articulo> cargarArticulos() {

        List<Articulo> articulos = new ArrayList<>();

        articulos.add(new Articulo("Camara Kodak", 100, R.drawable.camara_kodak));
        articulos.add(new Articulo("Computadora Asus", 100, R.drawable.computadora_asus));
        articulos.add(new Articulo("Cuchillo", 100, R.drawable.cuchillo_usado));
        articulos.add(new Articulo("Ford Fiesta", 100, R.drawable.ford_fiesta));
        articulos.add(new Articulo("Libro Android", 100, R.drawable.libro_android));
        articulos.add(new Articulo("Libro Clean Code", 100, R.drawable.libro_clean_code));
        articulos.add(new Articulo("Simpsons DVD", 100, R.drawable.simpsons_dvd));
        articulos.add(new Articulo("SoutPark DVD", 100, R.drawable.south_park_dvd));
        articulos.add(new Articulo("Volver al Futuro DVD", 100, R.drawable.volver_al_futuro_dvd));

        return articulos;

    }
}
