package com.example.digitalhouse.listas;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.AdapterView;

/**
 * Created by digitalhouse on 03/05/17.
 */

public class ListenerPersonaje implements AdapterView.OnItemClickListener {
    private MediaPlayer mediaPlayer;

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Context context = view.getContext();

        if (mediaPlayer != null){
            mediaPlayer.stop();
        }

        Personaje personaje =  (Personaje) parent.getItemAtPosition(position);
        Integer audioResource = R.raw.hey_listen;
        switch (personaje.getFotoResource()){
            case R.drawable.bart:
                audioResource = R.raw.bart;
                break;
            case R.drawable.rambo:
                audioResource = R.raw.rambo;
                break;
            case R.drawable.spiderman:
                audioResource = R.raw.spiderman;
                break;
            case R.drawable.thor:
                audioResource = R.raw.thor;
                break;
            case R.drawable.cenicienta:
                audioResource = R.raw.cenicienta;
                break;
        }


        System.out.println(audioResource);
        if (mediaPlayer != null){
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(context, audioResource);
        mediaPlayer.start();

    }
}
