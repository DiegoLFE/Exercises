package com.digitalhouse.fragmentexample;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FragmentRojo fragmentRojo = new FragmentRojo();
        final FragmentVerde fragmentVerde = new FragmentVerde();

        // Pido el Fragment Manager
        final FragmentManager fragmentManager = getSupportFragmentManager();

        Button buttonRojo = (Button) findViewById(R.id.buttonRojo);
        buttonRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Primera Transaccion
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayoutBottom, fragmentRojo);
                fragmentTransaction.commit();
            }
        });


        Button buttonVerde = (Button) findViewById(R.id.buttonVerde);
        buttonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Segunda Transaccion
                FragmentTransaction fragmentTransaction2 = fragmentManager.beginTransaction();
                fragmentTransaction2.replace(R.id.frameLayoutBottom, fragmentVerde);
                fragmentTransaction2.commit();
            }
        });
    }
}
