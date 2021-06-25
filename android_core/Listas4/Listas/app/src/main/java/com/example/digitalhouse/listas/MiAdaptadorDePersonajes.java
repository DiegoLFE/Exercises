package com.example.digitalhouse.listas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by digitalhouse on 27/04/17.
 */

public class MiAdaptadorDePersonajes extends BaseAdapter{
    // Atributos
    private List<Personaje> listaDePersonajes;
    private Context context;

    // Constructor
    public MiAdaptadorDePersonajes(Context unContext, List<Personaje> unaListaDePersonajes){
        context = unContext;
        listaDePersonajes = unaListaDePersonajes;
    }

    @Override
    public int getCount() {
        return listaDePersonajes.size();
    }

    @Override
    public Personaje getItem(int position) {
        return listaDePersonajes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtengo el inflador.
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        // Inflamos la vista
        View view = layoutInflater.inflate(R.layout.list_item_personajes, parent, false);

        // Busco el dato de la posicion que me piden
        Personaje personaje = listaDePersonajes.get(position);

        // Busco los componentes que deben ser llenados
        TextView textViewNombre = (TextView) view.findViewById(R.id.textViewNombre);
        TextView textViewSuperPoder = (TextView) view.findViewById(R.id.textViewSuperPoder);
        ImageView imageViewPersonaje = (ImageView) view.findViewById(R.id.imageViewPersonaje);

        // LLeno los componentes con los el dato que buscamos anteriormente
        textViewNombre.setText(personaje.getNombre());
        textViewSuperPoder.setText(personaje.getSuperPoder());
        imageViewPersonaje.setImageResource(personaje.getFotoResource());

        // Devuelvo la vista inflada y rellenada
        return view;
    }
}
