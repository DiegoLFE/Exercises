package com.digitalhouse.navigationdrawer;

public class Recipe {
    private String tituloRecipe;
    private String recipeDes;
    private  Integer recipeImage;

    public Recipe(String tituloRecipe, String recipeDes, Integer recipeImage) {
        this.tituloRecipe = tituloRecipe;
        this.recipeDes = recipeDes;
        this.recipeImage = recipeImage;
    }

    public Integer getRecipeImage() {
        return recipeImage;
    }

    public String getRecipeDes() {

        return recipeDes;
    }

    public String getTituloRecipe() {

        return tituloRecipe;
    }
}
