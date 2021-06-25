package com.digitalhouse.integratorio.View.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.digitalhouse.integratorio.R;
import com.squareup.picasso.Picasso;

/**
 * Created by digitalhouse on 14/06/17.
 */

public class FragmentCard extends Fragment {
    public static final String IMAGE_KEY = "imageKey";
    private String imageUrl = "error";

    public static FragmentCard createFragmentCard(String imageUrl){
        FragmentCard fragmentCard = new FragmentCard();
        Bundle bundle = new Bundle();
        bundle.putString(IMAGE_KEY, imageUrl);
        fragmentCard.setArguments(bundle);
        return fragmentCard;
    }


    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null){
            imageUrl = bundle.getString(IMAGE_KEY);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_viewpager, container, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        Picasso.with(getContext()).load(imageUrl).placeholder(R.drawable.tcg).into(imageView);

        return view;
    }
}
