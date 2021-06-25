import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 23/03/17.
 */
public class Evento {
    // Atributos
    private List<Invitado> invitados = new ArrayList<>();
    private List<Explotable> listaExplotables = new ArrayList<>();

    // Métodos
    public void agregarInvitado(Invitado unInvitado){
        invitados.add(unInvitado);
    }
    public void agregarExplotable(Explotable unExplotable){
        listaExplotables.add(unExplotable);
    }

    public void soplarVelas(){
        reventarTodo();
        repartirTorta();
    }

    private void reventarTodo(){
        for (Explotable unExplotable : listaExplotables){
            unExplotable.explotar();
        }
    }

    private void repartirTorta(){
        for (Invitado unInvitado : invitados){
            unInvitado.comerTorta();
        }
    }
}
