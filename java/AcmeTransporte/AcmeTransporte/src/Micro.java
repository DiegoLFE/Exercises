import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/03/17.
 */
public class Micro extends Vehiculo {
    // Atributo
    private Integer cantPlazasParadas;              // numero de plazas parados
    private Integer cantPlazasParadasOcupadas = 0;  // cantidad de personas paradas

    // Constructor
    public Micro(Integer unaCantAsientos, Integer plazasParadas) {
        super(unaCantAsientos);                     // Llamo al constructor del padre
        cantPlazasParadas = plazasParadas;          // Inicializo la cantidad de plazas paradas
    }

    //Métodos
    @Override
    public Boolean subirPasajero(Pasajero unPasajero) {
        Boolean subioSentado = super.subirPasajero(unPasajero);         // Ejecuto el metodo subir pasajero del padre.
        if (subioSentado){                                              // Si pudo subir sentado:
            return true;                                                    // Ya esta, barbaro.
        } else {                                                        // Si no pudo subir sentado:
            if (unPasajero.getPrefIrSentado() == true){                     // Pregunto su preferencia. Si desea ir sentado:
                return false;                                               // No lo puedo subir
            } else {                                                    // Si esta de acuerdo con ir parado:
                if (cantPlazasParadas - cantPlazasParadasOcupadas > 0){     // Me fijo si hay plazas parados. Si hay:
                    pasajeros.add(unPasajero);                                  // Subimos al pasajero.
                    cantPlazasParadasOcupadas++;                                // Modifico la cantidad de personas paradas
                    return true;                                                // Devuelvo que lo pude subir
                } else {                                                    // Si no hay:
                    return false;                                               // Devuelvo que no lo pudo subir
                }
            }
        }
    }

    @Override
    public void bajarPasajero() {
        if (cantPlazasParadasOcupadas > 0){                                // Si hay pasajeros parada:
            pasajeros.remove(0);                                                // Bajo un pasajero parado
            cantPlazasParadasOcupadas--;                                        // Modifico la cantidad de pasajeros parados
        } else {                                                           // Si no hay pasajeros parados:
            super.bajarPasajero();                                              // Bajamos un pasajero sentado.
        }
    }

    @Override
    public void subirGrupo(ArrayList<Pasajero> grupoDePasajeros) {         // Por cada pasajero del grupo:
        for (Integer i = 0; i < grupoDePasajeros.size(); i++){                  // Lo subimos. El Método subirPasajero del micro verifica si se puede subir
            subirPasajero(grupoDePasajeros.get(i));                             // Importante: Usamos la funcion subirPasajero del micro, no del vehiculo.
        }
    }
}
