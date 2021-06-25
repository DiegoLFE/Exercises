package Ejercitacion3;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio7 {

    ArrayList<Integer> eliminarPares(ArrayList<Integer> unArrayDeNumeros){

        ArrayList<Integer> listaSinPares = new ArrayList<>();

        for(Integer i = 0; i < unArrayDeNumeros.size(); i++){

            //Si el numero es impar, lo agrego a una nueva lista (NUNCA HACER UN REMOVE DENTRO DE UN CICLO FOR)
           if(unArrayDeNumeros.get(i) % 2 == 1){
               listaSinPares.add(unArrayDeNumeros.get(i));
           }
        }
        return listaSinPares;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio7 ejercicio7 = new Ejercicio7();
        //Test 1
        ArrayList<Integer> prueba = new ArrayList<Integer>();
        prueba.add(1);
        prueba.add(2);
        prueba.add(3);
        System.out.println(ejercicio7.eliminarPares(prueba));

        //Test 2
        ArrayList<Integer> prueba2 = new ArrayList<Integer>();
        prueba2.add(2);
        prueba2.add(4);
        prueba2.add(3);
        prueba2.add(7);
        System.out.println(ejercicio7.eliminarPares(prueba2));

        //Test 3
        ArrayList<Integer> prueba3 = new ArrayList<Integer>();
        prueba3.add(2);
        prueba3.add(2);
        prueba3.add(2);
        prueba3.add(2);
        System.out.println(ejercicio7.eliminarPares(prueba3));
    }
}
