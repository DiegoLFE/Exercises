package com.example.digitalhouse.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Fragment2 extends Fragment {
    public static final String CLAVE_IMAGEN = "imagen";
    public static final String CLAVE_DESCRIPCION = "descripcion";
    public static final String CLAVE_NOMBRE = "nombre";
    public static final String CLAVE_PRECIO = "precio";

    private Integer precio;
    private Integer imagen;
    private String descripcion;
    private String nombre;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Bundle bundle = getArguments();

        if (bundle != null){
            descripcion= bundle.getString(CLAVE_DESCRIPCION);
            imagen= bundle.getInt(CLAVE_IMAGEN);
            nombre= bundle.getString(CLAVE_NOMBRE);
            precio= bundle.getInt(CLAVE_PRECIO);

        }

        View view = inflater.inflate(R.layout.fragment2, container, false);


        TextView textView = (TextView) view.findViewById(R.id.nombreProducto);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageViewDetalle);
        TextView textView1 = (TextView) view.findViewById(R.id.descripcionProducto);
        TextView textView2 = (TextView) view.findViewById(R.id.precioProducto);

        textView.setText(nombre);
        textView1.setText(descripcion);
        imageView.setImageResource(imagen);
        textView2.setText(precio + "$");
        return view;
    }
}
