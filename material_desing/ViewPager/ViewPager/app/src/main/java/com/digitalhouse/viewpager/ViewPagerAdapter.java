package com.digitalhouse.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 31/05/17.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> listaDeFragments = new ArrayList<>(); //FRAGMENTS

    public ViewPagerAdapter(FragmentManager fm, List<Dato> unaListaDeColores) {
        super(fm);
        for (Dato dato:  unaListaDeColores) {
            ColorFragment unColorFragment = ColorFragment.fabricaDeFragmentosDeColores(dato.getColor());
            listaDeFragments.add(unColorFragment);
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
