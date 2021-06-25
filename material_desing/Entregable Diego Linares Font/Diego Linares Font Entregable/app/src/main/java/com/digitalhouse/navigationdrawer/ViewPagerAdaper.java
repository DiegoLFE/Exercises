package com.digitalhouse.navigationdrawer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdaper extends FragmentStatePagerAdapter {
    private List<Fragment> listaDeFragments = new ArrayList<>();


    public ViewPagerAdaper(FragmentManager fm, List<Restaurant> restaurantsList) {
        super(fm);
        for(Restaurant restaurant : restaurantsList) {
            FragmentRestaurant fragmentRestaurants = FragmentRestaurant.fabricaDeFragmentosDeRestaurants(restaurant.getName(),restaurant.getDescripcion(),restaurant.getImagen());
            listaDeFragments.add(fragmentRestaurants);
        }
    }

    @Override
    public Fragment getItem(int position) {
        return listaDeFragments.get(position);
    }

    @Override
    public int getCount() {
        return listaDeFragments.size();
    }
}


