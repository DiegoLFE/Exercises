package com.example.dh1.integrador.View.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.dh1.integrador.Model.POJO.Card;
import com.example.dh1.integrador.View.Fragments.CardFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dh1 on 15/06/17.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragmentList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm, List<Card> cardList) {
        super(fm);
        for (Card card: cardList){
                // Crear un Fragment Card
            CardFragment cardFragment = CardFragment.factoryCard(card.getImageUrl());
            fragmentList.add(cardFragment);
        }
    }

    public void setFragmentList(List<Card> cardList) {

        fragmentList.clear();

        for (Card card: cardList){
            // Crear un Fragment Card
            CardFragment cardFragment = CardFragment.factoryCard(card.getImageUrl());
            fragmentList.add(cardFragment);
        }
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
