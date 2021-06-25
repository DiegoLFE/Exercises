package EJMedidores.Medidores;

import EJMedidores.Alertable;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by digitalhouse on 30/03/17.
 */
public abstract class Notificador {
    // Atributos
    private Set<Alertable> conjuntoDeAlertables = new HashSet<>();

    // Métodos
    public void suscribir(Alertable alertable){
        conjuntoDeAlertables.add(alertable);
    }

    public void desuscribir(Alertable alertable){
        conjuntoDeAlertables.remove(alertable);
    }

    public void emitirAlerta(){
        for (Alertable alertable: conjuntoDeAlertables){
            alertable.recibirAlerta(this);
        }
    }
}
