package com.digitalhouse.navigationdrawer;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ViewPagerRestaurant extends Fragment  {


    private List<Restaurant> restaurantsList ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            cargarRestaurants();
        ViewPagerAdaper miAdapter = new ViewPagerAdaper(fragmentManager, restaurantsList);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        viewPager.setAdapter(miAdapter);
        viewPager.setPageMargin(10);
        viewPager.setClipToPadding(false);
        return view;
    }
public void cargarRestaurants(){
    this.restaurantsList = new ArrayList<>();
    restaurantsList.add(new Restaurant("Astrid y Gaston","Lima, Perú",R.drawable.astridygaston));
    restaurantsList.add(new Restaurant("Borago","Santiago, Chile",R.drawable.borago));
    restaurantsList.add(new  Restaurant("Central","Lima, Perú",R.drawable.central));
    restaurantsList.add(new  Restaurant("D.O.M.","San Pablo, Brasil",R.drawable.dom));
    restaurantsList.add(new  Restaurant("Maido","Lima, Perú",R.drawable.maido));
    restaurantsList.add(new  Restaurant("Mani","San Pablo, Brasil",R.drawable.mani));
    restaurantsList.add(new  Restaurant("Quintonil","Ciudad de México",R.drawable.quintonil));
    restaurantsList.add(new  Restaurant("Tegui","Buenos Aires, Argentina)",R.drawable.tegui));

}




}
