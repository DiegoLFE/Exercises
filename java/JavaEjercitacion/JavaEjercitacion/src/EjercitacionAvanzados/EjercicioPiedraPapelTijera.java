package EjercitacionAvanzados;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by digitalhouse on 11/08/16.
 */
public class EjercicioPiedraPapelTijera {

    public static String jugarAlPiedraPapelOTijera(String eleccion){
        //Comenzar a escribir código acá

        //Codigo para generar numeros aleatorios entre 0 y 2.
        Random random = new Random();
        Integer eleccionDeComputadora = random.nextInt(3);

        return "";
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        //Codigo para ingreso de nombre por teclado
        System.out.println ("Nombre del jugador:");
        String nombre = "";
        Scanner scan = new Scanner(System.in);
        nombre = scan.nextLine();

        //Codigo para ingreso de elección poandresr teclado
        System.out.println ("Elección del jugador:");
        String eleccion = "";
        eleccion = scan.nextLine();

        System.out.println("El jugador " + nombre + " resultó " + jugarAlPiedraPapelOTijera(eleccion));
    }
}