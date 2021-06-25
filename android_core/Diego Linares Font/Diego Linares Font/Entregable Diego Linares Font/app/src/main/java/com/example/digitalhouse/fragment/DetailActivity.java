package com.example.digitalhouse.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent unIntent = getIntent();

        Bundle unBundle = unIntent.getExtras();


        Fragment unFragment2 = new Fragment2();

        unFragment2.setArguments(unBundle);


        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.rootSecondActivity, unFragment2);

        fragmentTransaction.commit();
    }
}
