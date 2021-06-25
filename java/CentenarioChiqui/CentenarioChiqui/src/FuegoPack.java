import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 23/03/17.
 */
public class FuegoPack implements Explotable{
    // Atributos
    private List<Explotable> listaDeFuegosArtificiales = new ArrayList<>();

    // Métodos
    public void agregarFuegoArtificial(Explotable unExplotable){
        listaDeFuegosArtificiales.add(unExplotable);
    }

    @Override
    public void explotar() {
        for (Explotable unExplotable : listaDeFuegosArtificiales){
            unExplotable.explotar();
        }
    }

}
