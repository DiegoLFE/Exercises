package com.digitalhouse.integratorio.View.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.digitalhouse.integratorio.Model.POJO.Card;
import com.digitalhouse.integratorio.View.Fragments.FragmentCard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 14/06/17.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragmentList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm, List<Card> cardList) {
        super(fm);
        for (Card card : cardList){
            Fragment fragment = FragmentCard.createFragmentCard(card.getImage());
            fragmentList.add(fragment);
        }
    }

    public void setFragmentList(List<Card> cardList, Boolean cleanList) {
        if (cleanList) {
            fragmentList.clear();
        }

        for (Card card : cardList){
            Fragment fragment = FragmentCard.createFragmentCard(card.getImage());
            fragmentList.add(fragment);
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


    public void destroy(){
        fragmentList.clear();
        fragmentList = null;
    }
}
