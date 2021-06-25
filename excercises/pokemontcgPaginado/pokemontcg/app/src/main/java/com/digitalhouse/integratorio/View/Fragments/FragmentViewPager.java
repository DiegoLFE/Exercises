package com.digitalhouse.integratorio.View.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.digitalhouse.integratorio.Controller.ControllerCard;
import com.digitalhouse.integratorio.Model.POJO.Card;
import com.digitalhouse.integratorio.R;
import com.digitalhouse.integratorio.Util.ResultListener;
import com.digitalhouse.integratorio.View.Adapters.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentViewPager extends Fragment {
    private ViewPagerAdapter viewPagerAdapter;
    private ControllerCard controllerCard;
    private Boolean loading = false;
    private Integer totalCount;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_layout, container, false);


        List<Card> cardList = new ArrayList<>();
        viewPagerAdapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager(), cardList);

        update();


        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setPageMargin(20);
        viewPager.setClipToPadding(false);


        viewPager.addOnPageChangeListener(new ListenerViewPager());

        return view;
    }

    private void update(){
        controllerCard = new ControllerCard();
        controllerCard.getCardList(getContext(), new ResultListener<List<Card>>() {
            @Override
            public void finish(List<Card> resultado) {
                viewPagerAdapter.setFragmentList(resultado, true);
                viewPagerAdapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        viewPagerAdapter.destroy();
        controllerCard = null;
        viewPagerAdapter = null;
    }

    private class ListenerViewPager implements ViewPager.OnPageChangeListener{

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            if (controllerCard.isRequestPaginationEnded()){
                return;
            }

            totalCount = viewPagerAdapter.getCount();

            if (!loading && totalCount <= position + 2){
                loading = true;
                controllerCard.getCardList(getContext(), new ResultListener<List<Card>>() {
                    @Override
                    public void finish(List<Card> resultado) {
                        loading = false;
                        viewPagerAdapter.setFragmentList(resultado, false);
                        viewPagerAdapter.notifyDataSetChanged();
                    }
                });

            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }
}
