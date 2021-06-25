package com.digitalhouse.navigationdrawer;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawer.openDrawer(Gravity.LEFT);


        final NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragmentRojo = new RedFragment();
                Fragment fragmentVerde = new GreenFragment();
                Fragment fragmentAzul = new BlueFragment();


                switch (item.getItemId()) {
                    case R.id.menu_seccion_1:
                        colocarFragment(fragmentRojo);
                        break;
                    case R.id.menu_seccion_2:
                        colocarFragment(fragmentVerde);
                        break;
                    case R.id.menu_seccion_3:
                        colocarFragment(fragmentAzul);
                        break;
                    case R.id.menu_seccion_4:
                        colocarFragment(fragmentRojo);
                        break;
                    case R.id.menu_seccion_5:
                        colocarFragment(fragmentVerde);
                        break;
                    case R.id.menu_seccion_6:
                        colocarFragment(fragmentAzul);
                        break;
                    default:
                        Snackbar.make(navigationView, "Hola " + item.getTitle(), Snackbar.LENGTH_SHORT).show();
                        break;
                }

                drawer.closeDrawers();

                return false;
            }
        });
    }


    private void colocarFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contentFrame, fragment);
        fragmentTransaction.commit();
    }

}
