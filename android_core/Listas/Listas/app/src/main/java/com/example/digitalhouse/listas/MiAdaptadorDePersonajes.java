package com.example.digitalhouse.listas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by digitalhouse on 27/04/17.
 */

public class MiAdaptadorDePersonajes extends BaseAdapter{
    private List<Personaje> listaDePersonajes;
    private Context context;

    public MiAdaptadorDePersonajes(Context unContext, List<Personaje> unaListaDePersonajes){
        context = unContext;
        listaDePersonajes = unaListaDePersonajes;
    }

    @Override
    public int getCount() {
        return listaDePersonajes.size();
    }

    @Override
    public Object getItem(int position) {
        return listaDePersonajes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Obtengo el inflador.
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //Inflemos
        View view = layoutInflater.inflate(R.layout.list_item_personajes, parent, false);

        TextView textViewNombre = (TextView) view.findViewById(R.id.textViewNombre);
        TextView textViewSuperPoder = (TextView) view.findViewById(R.id.textViewSuperPoder);
        Personaje personaje = listaDePersonajes.get(position);
        //(Personaje) getItem(position);
        textViewNombre.setText(personaje.getNombre());
        textViewSuperPoder.setText(personaje.getSuperPoder());



        return view;
    }
}
