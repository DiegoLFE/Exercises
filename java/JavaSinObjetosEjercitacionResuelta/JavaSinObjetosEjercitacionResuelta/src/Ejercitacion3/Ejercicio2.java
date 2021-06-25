package Ejercitacion3;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio2 {

    Integer totalParesArray(ArrayList<Integer> unArrayList){
        Integer sumaPares = 0;
        for(Integer i = 0; i < unArrayList.size(); i++){

            //Si es par, lo sumo
            if( unArrayList.get(i) % 2 == 0){
             sumaPares = sumaPares + unArrayList.get(i);
            }
        }
        return sumaPares;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio2 ejercicio2 = new Ejercicio2();
        //Test 1
        ArrayList<Integer> prueba = new ArrayList<Integer>();
        prueba.add(1);
        prueba.add(2);
        prueba.add(3);
        System.out.println(ejercicio2.totalParesArray(prueba));

        //Test 2
        ArrayList<Integer> prueba2 = new ArrayList<Integer>();
        prueba2.add(2);
        prueba2.add(4);
        prueba2.add(3);
        prueba2.add(7);
        System.out.println(ejercicio2.totalParesArray(prueba2));

        //Test 3
        ArrayList<Integer> prueba3 = new ArrayList<Integer>();
        prueba3.add(2);
        prueba3.add(2);
        prueba3.add(2);
        prueba3.add(2);
        System.out.println(ejercicio2.totalParesArray(prueba3));
    }
}
