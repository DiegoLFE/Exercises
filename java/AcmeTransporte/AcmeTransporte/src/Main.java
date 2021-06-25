import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/03/17.
 */
public class Main {
    public static void main(String[] args){
        Vehiculo auto = new Vehiculo(5);        // Creo un auto
        Vehiculo combi = new Vehiculo(15);      // Creo una combi
        Vehiculo micro = new Micro(3, 15);      // Creo un micro

        Pasajero pasajero1 = new Pasajero(true);  // Creo pasajeros
        Pasajero pasajero2 = new Pasajero(true);
        Pasajero pasajero3 = new Pasajero(false);
        Pasajero pasajero4 = new Pasajero(true);
        Pasajero pasajero5 = new Pasajero(true);
        Pasajero pasajero6 = new Pasajero(false);
        Pasajero pasajero7 = new Pasajero(true);

        ArrayList<Pasajero> grupo1 = new ArrayList<>(); // Creo un grupo de Pasajeros
        grupo1.add(pasajero1);  // Agrego el pasajero1 al grupo
        grupo1.add(pasajero2);  // Agrego el pasajero2 al grupo

        // 4 pasajeros, todos sentados
        auto.subirPasajero(pasajero6);    // Subo el pasajero6 al auto
        auto.subirPasajero(pasajero7);    // Subo el pasajero7 al auto
        auto.subirGrupo(grupo1);          // Subo el grupo1 de pasajeros al auto

        // cuantos pasajeros: 3 sentados porque el pasajero2 solo quiere ir sentado.
        micro.subirPasajero(pasajero3);    // Subo el pasajero3 al micro
        micro.subirPasajero(pasajero5);    // Subo el pasajero5 al micro
        micro.subirGrupo(grupo1);          // Subo el grupo1 al micro

        System.out.println("micro pasajeros: " + micro.getCantidadPasajeros()); //Imprime la cantidad de pasajeros que hay dentro del micro.





    }
}
