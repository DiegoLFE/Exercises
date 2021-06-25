package com.digitalhouse.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // LISTA DE DATOS
        List<Dato> listaDeColores = new ArrayList<>();
        listaDeColores.add(new Dato("#FF0000"));
        listaDeColores.add(new Dato("#FF0000"));
        listaDeColores.add(new Dato("#FF0000"));

        // FM
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Adapter
        ViewPagerAdapter miAdapter = new ViewPagerAdapter(fragmentManager, listaDeColores);


        // View Pager
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(miAdapter);
        viewPager.setCurrentItem(1);
        viewPager.setPageMargin(30);
        viewPager.setClipToPadding(false);

    }
}
