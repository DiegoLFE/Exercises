package Ejercitacion3;

import Ejercitacion2.*;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio1 {

    public Integer totalArray(ArrayList<Integer> unArrayList){

        Integer suma = 0;
        for(Integer i = 0; i < unArrayList.size(); i++){
            suma = suma + unArrayList.get(i);
        }
        return suma;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio1 ejercicio1 = new Ejercicio1();
        //Test 1
        ArrayList<Integer> prueba = new ArrayList<Integer>();
        prueba.add(1);
        prueba.add(2);
        prueba.add(3);
        System.out.println(ejercicio1.totalArray(prueba));

        //Test 2
        ArrayList<Integer> prueba2 = new ArrayList<Integer>();
        prueba2.add(2);
        prueba2.add(4);
        prueba2.add(3);
        prueba2.add(7);
        System.out.println(ejercicio1.totalArray(prueba2));

        //Test 3
        ArrayList<Integer> prueba3 = new ArrayList<Integer>();
        prueba3.add(2);
        prueba3.add(2);
        prueba3.add(2);
        prueba3.add(2);
        System.out.println(ejercicio1.totalArray(prueba3));
    }
}
