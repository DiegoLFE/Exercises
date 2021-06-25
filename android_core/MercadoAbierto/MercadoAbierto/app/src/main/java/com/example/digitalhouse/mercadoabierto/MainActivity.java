package com.example.digitalhouse.mercadoabierto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Producto> listaDeProductos;
    private MiAdaptador adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creo los datos
        listaDeProductos = new ArrayList<>();
        listaDeProductos.add(new Producto("Camara Kodak", 9000, R.drawable.camara_kodak));
        listaDeProductos.add(new Producto("Cuchillo", 9000, R.drawable.cuchillo_usado));
        listaDeProductos.add(new Producto("Computadora Asus", 9000, R.drawable.computadora_asus));
        listaDeProductos.add(new Producto("Ford Fiesta", 9000, R.drawable.ford_fiesta));
        listaDeProductos.add(new Producto("Libro Android", 9000, R.drawable.libro_android));
        listaDeProductos.add(new Producto("Libro Clean Code", 9000, R.drawable.libro_clean_code));
        listaDeProductos.add(new Producto("DVD Simpson", 9000, R.drawable.simpsons_dvd));
        listaDeProductos.add(new Producto("DVD South Park", 9000, R.drawable.south_park_dvd));
        listaDeProductos.add(new Producto("DVD Volver al futuro", 9000, R.drawable.volver_al_futuro_dvd));

        // Busco la listview
        ListView listView = (ListView) findViewById(R.id.listView);

        // Creo el Adapter (Aqui se asocian los datos con el adapter)
        adapter = new MiAdaptador(this, listaDeProductos);
        // Asocio la ListView con el Adapter
        listView.setAdapter(adapter);
    }

    public void agregarProducto(View v){
        // Busco los EditText
        EditText editNombre = (EditText)findViewById(R.id.editNombre);
        EditText editPrecio = (EditText)findViewById(R.id.editPrecio);
        // Extraigo los datos
        String nombre = editNombre.getText().toString();
        Integer precio = Integer.parseInt(editPrecio.getText().toString());

        // Creo el producto
        Producto producto = new Producto(nombre,precio, R.drawable.none);
        // Lo agrego a la lista
        listaDeProductos.add(producto);
        // Notifico el adapter
        adapter.notifyDataSetChanged();
    }

}
