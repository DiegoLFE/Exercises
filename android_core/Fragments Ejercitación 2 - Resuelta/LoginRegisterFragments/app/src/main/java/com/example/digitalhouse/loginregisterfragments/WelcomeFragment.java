package com.example.digitalhouse.loginregisterfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {

    public static final String USERNAME = "username";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_welcome, container, false);

        TextView textViewUsername = (TextView) view.findViewById(R.id.textViewWelcome);

        Bundle bundle = getArguments();

        String username = bundle.getString(USERNAME);

        textViewUsername.setText("¡Welcome " + username + "!");

        return view;
    }

}
