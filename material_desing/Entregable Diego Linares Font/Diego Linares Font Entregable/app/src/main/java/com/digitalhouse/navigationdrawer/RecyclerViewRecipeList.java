package com.digitalhouse.navigationdrawer;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class RecyclerViewRecipeList extends Fragment {

    private Noti not;
    private List<Recipe> recipeList;
    private RecyclerView recyclerViewRecipe;
    private RecipeAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_recipe_list, container, false);

        cargarListaDeRecipe();


        recyclerViewRecipe = (RecyclerView) view.findViewById(R.id.recycler_view_id);


        recyclerViewRecipe.setHasFixedSize(true);


        recyclerViewRecipe.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));

        adapter = new RecipeAdapter(recipeList, getContext());

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int posicion = recyclerViewRecipe.getChildAdapterPosition(view);
                List<Recipe>listaRecipe = adapter.getRecipes();

                Recipe recipeclickeada= listaRecipe.get(posicion);
                not.recibirRecipe(recipeclickeada);
            }
        };


        adapter.setListener(listener);
        recyclerViewRecipe.setAdapter(adapter);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.not = (Noti) context;
    }

    private void cargarListaDeRecipe(){
        this.recipeList = new ArrayList();

        recipeList.add(new Recipe ("Astrid y Gaston","La multiculturalidad del Perú y el mundo tiene un punto de encuentro, un lugar donde enamorarse: Lima.",R.drawable.astridygastonr));
        recipeList.add(new Recipe("Borago","En nuestro afán por reflejar lo que el suelo nos entrega en el momento, hemos traído hasta usted, el mejor producto proveniente desde un rincón del planeta más bien insólito, el que consideramos invaluable." + "Nuestros menús de degustación recogen y combinan, el mejor producto endémico del territorio Chileno, en permanente evolución a lo largo del año.",R.drawable.boragor));
        recipeList.add(new Recipe("Central","En Central se celebra la biodiversidad del Perú. Insumos frescos y una curiosidad inagotable por descubrir e integrar nuevos ingredientes a su carta dan lugar a una cocina peruana de vanguardia en el corazón del tradicional distrito de Miraflores en Lima.",R.drawable.centralr));
        recipeList.add(new Recipe("D.O.M.","“A gastronomia brasileira é um sonho viável.” A frase do chef Alex Atala sintetiza a trajetória do restaurante D.O.M. Criado em uma época na qual havia pouco conhecimento sobre os sabores do Brasil, o D.O.M. nasceu projeto e hoje é realidade. Uma realidade genuína que reverbera por todo o mundo difundindo ingredientes como açaí, jambu e tucupi. Não por imodéstia... por missão. ",R.drawable.domr));
        recipeList.add(new Recipe("Maido","La vida es movimiento. Nada es estático ni absoluto. Nadie lo es. Estamos en flujo constante, como lo están la Tierra, las mareas, las bacterias, la luz, la sangre de nuestros cuerpos, el color y la semilla.Bienvenido a nuestro mundo.",R.drawable.maidor));
        recipeList.add(new Recipe("Mani","servir os ingredientes mais frescos numa experiência que combine técnica e sabor, invenção e tradição, provocação e memória afetiva. essa é a filosofia da cozinha do Maní, amparada ainda na busca constante por simplicidade, sazonalidade e respeito ao pequeno produtor rural",R.drawable.manir));
        recipeList.add(new Recipe("Quintonil","Restaurante\n" +
                "Ubicado en Polanco y liderado por la mancuerna conformada por Jorge Vallejo en cocina y Alejandra Flores en sala, Quintonil ofrece una propuesta que expresa con claridad los sabores y las técnicas de la cocina mexicana contemporánea, desde la plataforma de un restaurante que integra a la perfección la dinámica de cocina y servicio, además de una visión contemporánea de la gastronomía nacional y los criterios de sustentabilidad. El trabajo de esta dupla los ha llevado a recibir numerosos reconocimentos entre los que se encuentra su presencia en la reconocida lista inglesa de los 50 Best World Restaurants desde 2015.",R.drawable.quintonilr));
        recipeList.add(new Recipe("Tegui","El menú está compuesto por 8 pasos. La propuesta de la noche se presenta en un menú único que incluye diferentes pasos que se cambian periódicamente de acuerdo a los productos de estación y las preferencias de su dueño. Es simplemente una guía para saber que se encontrará en esa oportunidad cada paladar. En algunas oportunidades y como parte del #proyectotierras un chef invitado se suma al anfitrión y juntos cocinan con productos regionales.",R.drawable.teguir));

    }


    public interface Noti{

         void recibirRecipe(Recipe recipe);

    }
}



