package Ejercitacion3;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio4 {

    ArrayList<Integer> listaDePrimerosCienPositivos(){

        ArrayList<Integer> listaDePrimerosCien = new ArrayList<>();
        for(Integer i = 0; i < 100; i++){
            listaDePrimerosCien.add(i);
        }
        return listaDePrimerosCien;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio4 ejercicio4 = new Ejercicio4();
        //Test 1
        System.out.println(ejercicio4.listaDePrimerosCienPositivos());
        
    }
}


