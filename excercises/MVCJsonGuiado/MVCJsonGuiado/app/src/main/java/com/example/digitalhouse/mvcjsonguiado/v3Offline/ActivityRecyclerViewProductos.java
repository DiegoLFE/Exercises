package com.example.digitalhouse.mvcjsonguiado.v3Offline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.digitalhouse.mvcjsonguiado.R;

import java.util.List;


public class ActivityRecyclerViewProductos extends AppCompatActivity {
    private List<Producto>productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_v3);
        cargarProductosEnpantalla();
    }

    public void cargarProductosEnpantalla(){
        if(hayInternet()){
            DAOProductoInternet daoProductoInternet = new DAOProductoInternet();
            this.productos = daoProductoInternet.obtenerProductosDeInternet();
        }else{
            DAOProductoArchivo daoProductoArchivo = new DAOProductoArchivo();
            this.productos = daoProductoArchivo.obtenerProductosDeArchivo();
        }
    }

    public Boolean hayInternet(){
        return true;
    }
}


