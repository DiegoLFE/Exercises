package com.example.digitalhouse.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterOP extends BaseAdapter {

    private Context context;
    private List<Producto> listaDeProductos;

    public AdapterOP(Context context, List<Producto> listaDeProductos) {
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

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.detalle_celda, parent, false);

        Producto producto = listaDeProductos.get(position);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(producto.getImagen());

        TextView nombre = (TextView) view.findViewById(R.id.nombre);
        nombre.setText(producto.getNombre());

        TextView precio = (TextView) view.findViewById(R.id.precio);
        precio.setText("$" +producto.getPrecio().toString());
        return view;
    }
}

