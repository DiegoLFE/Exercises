package Ejercitacion3;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio3 {

    ArrayList<Integer> soloLosParesArray(ArrayList<Integer> unArrayList){
        ArrayList<Integer> soloLosPares = new ArrayList<>();
        for(Integer i = 0; i < unArrayList.size(); i++){

            //Si es par, agrego el numero al array.
            if(unArrayList.get(i) % 2 == 0) {
                soloLosPares.add(unArrayList.get(i));
            }
        }
        return soloLosPares;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio3 ejercicio3 = new Ejercicio3();
        //Test 1
        ArrayList<Integer> prueba = new ArrayList<Integer>();
        prueba.add(1);
        prueba.add(2);
        prueba.add(3);
        System.out.println(ejercicio3.soloLosParesArray(prueba));

        //Test 2
        ArrayList<Integer> prueba2 = new ArrayList<Integer>();
        prueba2.add(2);
        prueba2.add(4);
        prueba2.add(3);
        prueba2.add(7);
        System.out.println(ejercicio3.soloLosParesArray(prueba2));

        //Test 3
        ArrayList<Integer> prueba3 = new ArrayList<Integer>();
        prueba3.add(2);
        prueba3.add(2);
        prueba3.add(2);
        prueba3.add(2);
        System.out.println(ejercicio3.soloLosParesArray(prueba3));
    }
}
