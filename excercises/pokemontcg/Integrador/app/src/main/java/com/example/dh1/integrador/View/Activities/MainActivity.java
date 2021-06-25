package com.example.dh1.integrador.View.Activities;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dh1.integrador.Controller.ControllerCard;
import com.example.dh1.integrador.Model.POJO.Card;
import com.example.dh1.integrador.R;
import com.example.dh1.integrador.Utils.ResultListener;
import com.example.dh1.integrador.View.Adapters.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Card> cards = new ArrayList<>();
        //cards.add(new Card("sdsd", "error"));

        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPagerAdapter = new ViewPagerAdapter(fragmentManager, cards);


        ControllerCard controllerCard = new ControllerCard();
        controllerCard.getListCard(this, new ResultListener<List<Card>>() {
            @Override
            public void finish(List<Card> resultado) {
                // ACA CONSUMO LO QUE TRAJO EL DAO
                viewPagerAdapter.setFragmentList(resultado);
                viewPagerAdapter.notifyDataSetChanged();
            }
        });



        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(viewPagerAdapter);

    }
}
