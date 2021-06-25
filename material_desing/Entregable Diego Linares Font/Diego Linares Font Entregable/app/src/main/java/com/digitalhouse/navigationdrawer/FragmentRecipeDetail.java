package com.digitalhouse.navigationdrawer;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentRecipeDetail extends Fragment {
    public static final String CLAVE_TITULO = "titulo_recipe";
    public static final String CLAVE_DESCRIPCION = "descripcion_recipe";
    public static final String CLAVE_IMAGENR = "imagen_recipe";


    public static FragmentRecipeDetail fabricaDeNoticias(Recipe unaRecipe){
        FragmentRecipeDetail fragmentRecipeDetail = new FragmentRecipeDetail();
        Bundle unBundle = new Bundle();
        unBundle.putString(CLAVE_TITULO, unaRecipe.getTituloRecipe());
        unBundle.putString(CLAVE_DESCRIPCION, unaRecipe.getRecipeDes());
        unBundle.putInt(CLAVE_IMAGENR, unaRecipe.getRecipeImage());
        fragmentRecipeDetail.setArguments(unBundle);
        return fragmentRecipeDetail;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment_recipe_detail, container, false);

        Bundle bundle = getArguments();

        String titulo = bundle.getString(CLAVE_TITULO);

        String descripcion = bundle.getString(CLAVE_DESCRIPCION);

        Integer image = bundle.getInt(CLAVE_IMAGENR);

        TextView textViewTitulo = (TextView) view.findViewById(R.id.titulo_receta);

        TextView textViewDescripcion = (TextView) view.findViewById(R.id.descripcion_receta);

        ImageView imageViewRecipe = (ImageView) view.findViewById(R.id.imagen_receta);

        textViewTitulo.setText(titulo);

        textViewDescripcion.setText(descripcion);

        imageViewRecipe.setImageResource(image);

        return view;
    }

}
