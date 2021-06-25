package com.digitalhouse.navigationdrawer;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements RecyclerViewRecipeList.Noti{
    private DrawerLayout drawer;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawer, R.string.open, R.string.close);

        drawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        actionBar = getSupportActionBar();
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);

        final NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragmentRestaurants = new ViewPagerRestaurant();
                Fragment fragment​AboutUs = new FragmentAboutUs();
                Fragment fragmentRecipe = new Fragment();

                switch (item.getItemId()) {
                    case R.id.restaurants:
                        ponerFragment(fragmentRestaurants);
                        break;
                    case R.id.about_us:
                        ponerFragment(fragment​AboutUs);
                        break;
                    case R.id.lista_de_recetas:
                        ponerFragment(fragmentRecipe);
                        break;
                }

                drawer.closeDrawers();

                return false;
            }
        });
    }
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private void actionBarSetup() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            android.app.ActionBar ab = getActionBar();
            ab.setTitle("My Title");
            ab.setSubtitle("sub-title");
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void ponerFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contentFrame, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void recibirRecipe(Recipe recipe) {
        Intent unIntent = new Intent(this, SecondActivity.class);

        Bundle unBundle = new Bundle();
        unBundle.putString(FragmentRecipeDetail.CLAVE_TITULO, recipe.getTituloRecipe());
        unBundle.putString(FragmentRecipeDetail.CLAVE_DESCRIPCION, recipe.getRecipeDes());
        unBundle.putInt(FragmentRecipeDetail.CLAVE_IMAGENR,recipe.getRecipeImage());

        unIntent.putExtras(unBundle);

        startActivity(unIntent);
    }
}
