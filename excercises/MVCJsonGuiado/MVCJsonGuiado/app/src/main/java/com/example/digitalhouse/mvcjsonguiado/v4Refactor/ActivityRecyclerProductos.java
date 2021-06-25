package com.example.digitalhouse.mvcjsonguiado.v4Refactor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.digitalhouse.mvcjsonguiado.R;
import com.example.digitalhouse.mvcjsonguiado.v3Offline.*;

import java.util.List;

public class ActivityRecyclerProductos extends AppCompatActivity {
    private List<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_deportivos_v4);

        cargarProductos();
    }

    public void cargarProductos(){
        ProductoController productoController = new ProductoController();
        this.productos = productoController.obtenerProductos();
    }
}


