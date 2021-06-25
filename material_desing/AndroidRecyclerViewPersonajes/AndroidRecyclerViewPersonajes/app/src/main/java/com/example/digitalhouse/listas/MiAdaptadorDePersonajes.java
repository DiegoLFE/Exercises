package com.example.digitalhouse.listas;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by digitalhouse on 27/04/17.
 */

public class MiAdaptadorDePersonajes extends RecyclerView.Adapter{

    // Atributos
    private List<Personaje> listaDePersonajes;
    private Context context;

    // Constructor
    public MiAdaptadorDePersonajes(Context unContext, List<Personaje> unaListaDePersonajes){
        context = unContext;
        listaDePersonajes = unaListaDePersonajes;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Obtengo el inflador.
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        // Inflamos la vista
        View view  = layoutInflater.inflate(R.layout.list_item_personajes, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Personaje personaje = listaDePersonajes.get(position);

        ViewHolder myViewHolder = (ViewHolder) holder;
        myViewHolder.cargarDatos(personaje);
    }

    @Override
    public int getItemCount() {
        return listaDePersonajes.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewNombre;
        private TextView textViewSuperpoder;
        private ImageView imageViewImagen;

        public ViewHolder(View view){
            super(view);
            textViewNombre = (TextView) view.findViewById(R.id.textViewNombre);
            textViewSuperpoder = (TextView) view.findViewById(R.id.textViewSuperPoder);
            imageViewImagen = (ImageView) view.findViewById(R.id.imageViewPersonaje);
        }

        public void cargarDatos(Personaje unPersonaje){
            textViewNombre.setText(unPersonaje.getNombre());
            textViewSuperpoder.setText(unPersonaje.getSuperPoder());
            imageViewImagen.setImageResource(unPersonaje.getFotoResource());
        }

    }
}
