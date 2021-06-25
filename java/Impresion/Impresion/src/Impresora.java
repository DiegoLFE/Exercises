import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/03/17.
 */
public class Impresora {
    // Atributos
    private ArrayList<Imprimible> listaImprimibles = new ArrayList<>();

    // Métodos
    public void agregarImprimible(Imprimible unImprimible){
        listaImprimibles.add(unImprimible);
    }

    public void imprimirTodos(){
        for (Integer i = 0; i < listaImprimibles.size();i++){
            listaImprimibles.get(i).imprimir();
        }
    }
}
