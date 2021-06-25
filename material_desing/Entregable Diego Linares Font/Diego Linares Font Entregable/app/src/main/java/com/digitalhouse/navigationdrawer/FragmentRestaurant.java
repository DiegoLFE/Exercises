package com.digitalhouse.navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentRestaurant extends Fragment {

    public static final String CLAVE_TITULO = "claveTitulo";
    public static final String CLAVE_DESCRIPCION = "claveDescripcion";
    public static final String CLAVE_IMAGEN = "claveImagen";
    private String titulo;
    private String descripcion;
    private Integer imagen;

    public static FragmentRestaurant fabricaDeFragmentosDeRestaurants(String titulo,String descripcion, Integer imagen){
        Bundle bundle = new Bundle();
        bundle.putString(CLAVE_TITULO , titulo);
        bundle.putString(CLAVE_DESCRIPCION , descripcion);
        bundle.putInt(CLAVE_IMAGEN , imagen);
        FragmentRestaurant fragmentRestaurants = new FragmentRestaurant();
        fragmentRestaurants.setArguments(bundle);
        return fragmentRestaurants;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        titulo = bundle.getString(CLAVE_TITULO);
        descripcion = bundle.getString(CLAVE_DESCRIPCION);
        imagen = bundle.getInt(CLAVE_IMAGEN);

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_restaurant_2, container, false);
        TextView ttulo1 = (TextView) view.findViewById(R.id.titulo_restaurant);
        TextView descripcion1 = (TextView) view.findViewById(R.id.descripcion_restaurant);
        ImageView imagen1 = (ImageView)view.findViewById(R.id.image_restaurant);

        ttulo1.setText(titulo);
        descripcion1.setText(descripcion);
        imagen1.setImageResource(imagen);





        return view;
    }

}
