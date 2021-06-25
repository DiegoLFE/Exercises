package com.digitalhouse.viewpager;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ColorFragment extends Fragment {
    private String color;
    public static final String CLAVE_COLOR = "claveColor";

    public static ColorFragment fabricaDeFragmentosDeColores(String color){
        Bundle bundle = new Bundle();
        bundle.putString(CLAVE_COLOR , color);
        ColorFragment colorFragment = new ColorFragment();
        colorFragment.setArguments(bundle);
        return colorFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bundle bundle = getArguments();
        color = bundle.getString(CLAVE_COLOR);

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_color, container, false);
        View root = view.findViewById(R.id.root);
        root.setBackgroundColor(Color.parseColor(color));
        return view;
    }

}
