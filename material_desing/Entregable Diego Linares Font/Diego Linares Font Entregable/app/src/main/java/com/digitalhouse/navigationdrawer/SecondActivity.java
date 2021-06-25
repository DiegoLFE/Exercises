package com.digitalhouse.navigationdrawer;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {
 private  FragmentRecipeDetail fragmentRecipeDetail ;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);

            Intent unIntent = getIntent();

            Bundle bundle = unIntent.getExtras();

            fragmentRecipeDetail = new FragmentRecipeDetail();

            fragmentRecipeDetail.setArguments(bundle);

            FragmentManager fragmentManager = getFragmentManager();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.add(R.id.contenedor_activity2,fragmentRecipeDetail);

            fragmentTransaction.commit();
        }
    }
