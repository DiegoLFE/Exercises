package Ejercitacion3;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio6 {

    ArrayList<Integer> numerosDeLaQuiniela(Integer cantidad){

    ArrayList<Integer> listaDeLaQuiniela = new ArrayList<>();

        Random random = new Random();
        for(Integer i = 0; i < cantidad; i++){

            //Pido un numero aleatorio entre 0 y 9999
            Integer numeroAleatorio = random.nextInt(10009);
            listaDeLaQuiniela.add(numeroAleatorio);
        }
        return listaDeLaQuiniela;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio6 ejercicio6 = new Ejercicio6();
        //Test 1
        System.out.println(ejercicio6.numerosDeLaQuiniela(5));

        System.out.println(ejercicio6.numerosDeLaQuiniela(100));
    }
}
