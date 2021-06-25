package com.example.dh2.listview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dh2 on 26/04/17.
 */

public class PersonajesAdapter extends RecyclerView.Adapter implements View.OnClickListener{

    private List<Personaje> personajes;
    private Context context;
    private View.OnClickListener listener;

    public PersonajesAdapter(List<Personaje> personajes, Context context) {
        this.personajes = personajes;
        this.context = context;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    //Devuelve un ViewHolder con la View
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View viewDeLaCelda = layoutInflater.inflate(R.layout.recyclerview_detalle_celda,parent,false);
        PersonajesViewHolder personajesViewHolder = new PersonajesViewHolder(viewDeLaCelda);

        //Aca declaro que voy a responder a cuando un usuario haga click en una de las celdas
        //Para esto declare arriba de to-do
        viewDeLaCelda.setOnClickListener(this);

        return personajesViewHolder;
    }

    //Acá es donde se une el ViewHolder con el elemento a mostrar
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Personaje unPersonaje = personajes.get(position);
        PersonajesViewHolder personajesViewHolder = (PersonajesViewHolder)holder;
        personajesViewHolder.cargarPersonaje(unPersonaje);

    }


    //Devolvemos la posición del ítem en la lista
    @Override
    public long getItemId(int position) {
        return position;
    }

    //Devuelve la cantidad de elementos contenidos en la lista
    @Override
    public int getItemCount() {
        return personajes.size();
    }

    //Aca es donde me guardo un listener
    //para avisarle cuando yo escucho que hacen click en una celda
    public void setListener(View.OnClickListener listener) {
        this.listener = listener;
    }


    public void removerPersonaje(Personaje personaje){
        personajes.remove(personaje);
        notifyDataSetChanged();
    }


    //Aca hago el pasamanos, por un lado el recycler escucha cuando una celda
    //es clickeada y este le avisa a su escuchador que una vista fue clickeada
    @Override
    public void onClick(View v) {
        listener.onClick(v);
    }

    //Aca creo al viewHolder que va a mantener las referencias
    //de los elementos de la celda y va a saber cargarla
    private class PersonajesViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewNombre;
        private TextView textViewPoder;
        private ImageView imageView;

        public PersonajesViewHolder(View itemView) {
            super(itemView);
            textViewNombre = (TextView) itemView.findViewById(R.id.textViewNombrePersonaje);
            textViewPoder = (TextView) itemView.findViewById(R.id.textViewPoder);
            imageView = (ImageView) itemView.findViewById(R.id.imageViewPersonaje);
        }

        public void cargarPersonaje(Personaje personajeAmostrar){

            textViewNombre.setText(personajeAmostrar.getNombre());
            textViewPoder.setText(personajeAmostrar.getSuperpoder());
            imageView.setImageResource(personajeAmostrar.getImagenId());
        }
    }
}
