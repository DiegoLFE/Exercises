package com.digitalhouse.floatinglabels;


import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentMain extends Fragment {
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment_main, container, false);

        final EditText editTextUsername = (EditText) view.findViewById(R.id.editTextUsername);
        final EditText editTextPassword = (EditText) view.findViewById(R.id.editTextPassword);
        final TextInputLayout textInputLayoutPassword = (TextInputLayout) view.findViewById(R.id.textInputLayoutPassword);


        Button button = (Button) view.findViewById(R.id.buttonLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();


                if (password.length() < 10){
                    textInputLayoutPassword.setError("Debe contener mas de 10 caracteres");
                } else {
                    textInputLayoutPassword.setError(null);

                    // COMUNICATE WITH ACTIVITY
                }
            }
        });

        editTextPassword.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                textInputLayoutPassword.setError(null);
                return false;
            }
        });



        return view;
    }
}
