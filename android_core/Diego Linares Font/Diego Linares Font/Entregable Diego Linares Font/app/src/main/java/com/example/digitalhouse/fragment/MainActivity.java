package com.example.digitalhouse.fragment;


import android.support.v4.app.Fragment;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment1.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment unFragment = new Fragment1();

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.rootMainActivity, unFragment);

        fragmentTransaction.commit();
    }

    @Override
    public void onFragmentInteraction(String nombre, String descripcion, Integer imagen, Integer precio) {

        Intent unIntent = new Intent(this, DetailActivity.class);

        Bundle unBundle = new Bundle();

        unBundle.putString(Fragment2.CLAVE_DESCRIPCION, descripcion);
        unBundle.putInt(Fragment2.CLAVE_IMAGEN, imagen);
        unBundle.putString(Fragment2.CLAVE_NOMBRE, nombre);
        unBundle.putInt(Fragment2.CLAVE_PRECIO, precio);

        unIntent.putExtras(unBundle);

        startActivity(unIntent);
    }
}
