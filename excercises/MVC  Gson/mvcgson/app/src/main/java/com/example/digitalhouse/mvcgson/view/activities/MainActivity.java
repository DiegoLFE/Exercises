package com.example.digitalhouse.mvcgson.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.digitalhouse.mvcgson.R;
import com.example.digitalhouse.mvcgson.controller.ControllerProducto;
import com.example.digitalhouse.mvcgson.model.POJO.Producto;
import com.example.digitalhouse.mvcgson.view.adapters.AdapterProducto;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Llamo al Controller
        ControllerProducto controllerProducto = new ControllerProducto();
        //Le pido al controller la lista de productos
        List<Producto> listaDeProductos = controllerProducto.getListaDeProductos(this);

        RecyclerView recyclerViewProductos = (RecyclerView) findViewById(R.id.recycler_productos);
        AdapterProducto adapterProducto = new AdapterProducto(listaDeProductos, this);

        recyclerViewProductos.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));
        recyclerViewProductos.setAdapter(adapterProducto);
    }
}
