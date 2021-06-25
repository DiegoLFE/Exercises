package com.example.digitalhouse.loginregisterfragments;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentFormulario.ComunicadorActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentFormulario fragmentFormulario = new FragmentFormulario();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.holderFragmentMainActivity, fragmentFormulario);
        fragmentTransaction.commit();
    }

    @Override
    public void mensajeParaActivity(String username) {
        Intent unIntent = new Intent(this, WelcomeActivity.class);
        Bundle unBundle = new Bundle();
        unBundle.putString(WelcomeFragment.USERNAME, username);
        unIntent.putExtras(unBundle);
        startActivity(unIntent);
    }
}
