package com.example.digitalhouse.mvcgson.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.digitalhouse.mvcgson.R;
import com.example.digitalhouse.mvcgson.controller.ControllerProducto;
import com.example.digitalhouse.mvcgson.model.POJO.Producto;
import com.example.digitalhouse.mvcgson.view.adapters.AdapterProducto;
import com.example.digitalhouse.util.ResultListener;

import java.util.ArrayList;
import java.util.List;

// PATRICIO
public class MainActivity extends AppCompatActivity{
    private AdapterProducto adapterProducto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creo el Controller
        ControllerProducto controllerProducto = new ControllerProducto();

        //Le pido al controller(Calamardo) la lista de productos. Le paso un contexto y le paso el listener mio (el de patricio)
        controllerProducto.getListaDeProductos(this, new ResultListener<List<Producto>>() {
            @Override
            public void finish(List<Producto> resultado) {
                // El controller me devuelve la lista de productos una vez cocinada
                adapterProducto.setListaDeProductos(resultado);
            }
        });

        RecyclerView recyclerViewProductos = (RecyclerView) findViewById(R.id.recycler_productos);
        adapterProducto = new AdapterProducto(new ArrayList<Producto>(), this);

        recyclerViewProductos.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));
        recyclerViewProductos.setAdapter(adapterProducto);
    }
}
