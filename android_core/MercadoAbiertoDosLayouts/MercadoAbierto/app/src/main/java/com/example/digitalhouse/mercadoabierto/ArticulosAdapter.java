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
 * Created by digitalhouse on 25/04/17.
 */

public class ArticulosAdapter extends BaseAdapter {

    private Context context;
    private List<Articulo> articulos;

    public void setContext(Context context) {
        this.context = context;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public int getCount() {
        return articulos.size();
    }

    @Override
    public Articulo getItem(int position) {
        return articulos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);

        if (position % 2 == 0){
            convertView = inflater.inflate(R.layout.detalle_articulo1, parent,false);
        } else {
            convertView = inflater.inflate(R.layout.detalle_articulo2, parent,false);
        }

        ImageView imageViewImagen = (ImageView) convertView.findViewById(R.id.imageViewCeldaDetalle);
        TextView textViewDescripcion = (TextView) convertView.findViewById(R.id.textViewNombreCeldaDetalle);
        TextView textViewPrecio = (TextView) convertView.findViewById(R.id.textViewPrecioCeldaDetalle);

        Articulo articulo = getItem(position);

        imageViewImagen.setImageResource(articulo.getImagen());
        textViewDescripcion.setText(articulo.getDescripcion());
        textViewPrecio.setText("$" + articulo.getPrecio());

        return convertView;
    }
}
