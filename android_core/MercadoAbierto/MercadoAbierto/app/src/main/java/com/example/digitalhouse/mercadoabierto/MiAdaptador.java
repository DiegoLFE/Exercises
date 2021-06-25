package com.example.digitalhouse.mercadoabierto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by digitalhouse on 03/05/17.
 */

public class MiAdaptador extends BaseAdapter {
    // Extiende de BaseAdapter para ser un Adapter

    // Atributos
    private Context context;
    private List<Producto> listaDeProductos;

    // Constructor
    public MiAdaptador(Context context, List<Producto> listaDeProductos) {
        this.context = context;
        this.listaDeProductos = listaDeProductos;
    }

    @Override
    public int getCount() {
        return listaDeProductos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaDeProductos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Busco el inflador
        LayoutInflater inflater = LayoutInflater.from(context);
        // Inflo la view
        View view = inflater.inflate(R.layout.list_items, parent, false);

        // Busco el dato con el cual voy a poblar la view
        Producto producto = listaDeProductos.get(position);

        // Busco los componentes de la view y les seteo el valor del dato buscado anteriormente.
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(producto.getFoto());

        TextView nombre = (TextView) view.findViewById(R.id.nombre);
        nombre.setText(producto.getNombre());

        TextView precio = (TextView) view.findViewById(R.id.precio);
        precio.setText(producto.getPrecio().toString());

        // Devuelvo la view
        return view;
    }
}
