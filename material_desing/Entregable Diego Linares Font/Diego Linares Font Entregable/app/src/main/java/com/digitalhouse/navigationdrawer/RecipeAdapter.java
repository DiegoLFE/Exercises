package com.digitalhouse.navigationdrawer;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter implements View.OnClickListener {
    private List<Recipe> recipes;
    private Context context;
    private View.OnClickListener mylistener;
    public RecipeAdapter(List<Recipe> recipes, Context context) {
        this.recipes = recipes;
        this.context = context;
    }
    public void setMyListener(View.OnClickListener myListener){
        this.mylistener = myListener;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View viewDeLaCelda = layoutInflater.inflate(R.layout.fragment_fragment_recipe_detail,parent,false);
        RecipeViewHolder recipeViewHolder = new RecipeViewHolder(viewDeLaCelda);
        viewDeLaCelda.setOnClickListener(this);

        return recipeViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Recipe unaRecipe = recipes.get(position);
        RecipeViewHolder recipeViewHolder= (RecipeViewHolder)holder;
        recipeViewHolder.cargarRecipe(unaRecipe);

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }

    public void setListener(View.OnClickListener listener) {
        this.mylistener = listener;
    }

    @Override
    public void onClick(View v) {
        mylistener.onClick(v);
    }

    private class RecipeViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewTitulo;
        private TextView textViewDescripcion;


        public RecipeViewHolder(View itemView) {
            super(itemView);
            textViewTitulo = (TextView) itemView.findViewById(R.id.titulo_receta);
            textViewDescripcion = (TextView) itemView.findViewById(R.id.descripcion_receta);
        }

        public void cargarRecipe(Recipe recipeParaCargar){

            textViewTitulo.setText(recipeParaCargar.getTituloRecipe());
            textViewDescripcion.setText(recipeParaCargar.getRecipeDes());
        }
    }
    public void setRecipes(List<Recipe> recipeList) {
        this.recipes = recipeList;
    }
}
