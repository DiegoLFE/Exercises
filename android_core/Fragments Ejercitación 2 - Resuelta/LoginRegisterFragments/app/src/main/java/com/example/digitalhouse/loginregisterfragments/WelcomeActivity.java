package com.example.digitalhouse.loginregisterfragments;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent unIntent = getIntent();
        Bundle unBundle = unIntent.getExtras();

        WelcomeFragment welcomeFragment = new WelcomeFragment();
        welcomeFragment.setArguments(unBundle);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.holderFragmentWelcomeActivity, welcomeFragment);
        fragmentTransaction.commit();
    }
}
