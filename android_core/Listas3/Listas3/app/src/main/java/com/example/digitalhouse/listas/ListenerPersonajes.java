package com.example.digitalhouse.listas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by digitalhouse on 04/05/17.
 */

public class ListenerPersonajes implements AdapterView.OnItemClickListener {
//    private Context context;
//    public  ListenerPersonajes(Context c){
//        this.context = c;
//    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Context context = view.getContext();

        Personaje personaje = (Personaje) parent.getItemAtPosition(position);

        Intent unIntent = new Intent(context, DetalleActivity.class);
        Bundle unBundle = new Bundle();
        unBundle.putString(DetalleActivity.CLAVE_NOMBRE, personaje.getNombre());
        unBundle.putString(DetalleActivity.CLAVE_SUPERPODER, personaje.getSuperPoder());
        unBundle.putInt(DetalleActivity.CLAVE_FOTO, personaje.getFotoResource());
        unIntent.putExtras(unBundle);

        context.startActivity(unIntent);

        //Toast.makeText(context, "Hola soy la view: " + personaje.getNombre(), Toast.LENGTH_SHORT).show();
    }
}
