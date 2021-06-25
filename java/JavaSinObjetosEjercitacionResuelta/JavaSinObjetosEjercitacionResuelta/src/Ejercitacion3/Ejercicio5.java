package Ejercitacion3;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio5 {

    ArrayList<Integer> listaDeNumerosEntre(Integer minimo, Integer maximo){

        ArrayList<Integer> listaDeNumerosEntre = new ArrayList<>();
        for(Integer i = minimo; i <= maximo; i++){
            listaDeNumerosEntre.add(i);
        }
        return listaDeNumerosEntre;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio5 ejercicio5 = new Ejercicio5();
        //Test 1
        System.out.println(ejercicio5.listaDeNumerosEntre(5, 25));

    }
}
