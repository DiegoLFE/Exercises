package com.example.dh1.integrador.View.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.dh1.integrador.R;
import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 */
public class CardFragment extends Fragment {
    public static final String IMAGE_KEY = "imageKey";

    public static CardFragment factoryCard(String imageUrl){
        CardFragment cardFragment = new CardFragment();

        Bundle bundle = new Bundle();
        bundle.putString(IMAGE_KEY, imageUrl);

        cardFragment.setArguments(bundle);

        return cardFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String imageUrl= "error";

        Bundle bundle = getArguments();
        if (bundle != null){
            imageUrl = bundle.getString(IMAGE_KEY);
        }

        View view = inflater.inflate(R.layout.fragment_card, container, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        Picasso.with(getContext())
                .load(imageUrl)
                .placeholder(R.drawable.tcg)
                .into(imageView);

        return view;
    }

}
