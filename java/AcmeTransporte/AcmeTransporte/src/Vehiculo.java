import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/03/17.
 */
public class Vehiculo {
    // Atributos
    private Integer cantAsientos;                                               // Cantidad de asientos en el vehiculo
    private Integer asientosOcupados = 0; // Este atributo no es indispensable  // Cantidad de asientos ocupados en el vehiculo.
    protected ArrayList<Pasajero> pasajeros = new ArrayList<>();                // Lista de pasajeros dentro del vehiculo.

    // Constructor
    public Vehiculo(Integer unaCantAsientos){
        cantAsientos = unaCantAsientos;                                         // Inicializo la cantidad de asientos al momento de construir un objeto.
    }

    // Metodos
    public Boolean subirPasajero(Pasajero unPasajero) {
        if (cantAsientos - asientosOcupados > 0) {                              // Si hay asientos libres:
            pasajeros.add(unPasajero);                                              // Subo al pasajero.
            asientosOcupados = asientosOcupados + 1; // asientosOcupados++;         // Modifico la cantidad de pasajeros
            return true;                                                            // Devuelvo que si logre subir al pasajero
        } else {                                                                // Si no hay asientos libres:
            System.out.println("No hay asientos disponibles");                      // Imprimo mensaje
            return false;                                                           // Devuelvo que no pude subir al pasajero
        }
    }

    public void bajarPasajero() {
        if (asientosOcupados > 0) {                                             // Si hay pasajeros en el vehículo:
            asientosOcupados--; // asientosOcupados = asientosOcupados - 1;         // Modifico la cantidad de pasajeros
            pasajeros.remove(0);                                                    // remuevo el primer elemento
        } else {                                                                // Si no hay pasajeros en el vehículo:
            System.out.println("El vehiculo se encuentra vacio");                   // Imprimo mensaje.
        }
    }

    public void subirGrupo(ArrayList<Pasajero> grupoDePasajeros) {
        for (Integer i = 0; i < grupoDePasajeros.size(); i++){                  // Por cada psajero del grupo:
            Pasajero unPasajero = grupoDePasajeros.get(i);                          // Busco el pasajero i;
            subirPasajero(unPasajero);                                              // Subo al pasajero i - La funcion subirPasajero se encarga de ver si hay lugar
        }
    }

    public Integer getCantidadPasajeros(){                                      // Devuelvo la cantidad de pasajeros en el vehiculo.
        return pasajeros.size();
    }

}

