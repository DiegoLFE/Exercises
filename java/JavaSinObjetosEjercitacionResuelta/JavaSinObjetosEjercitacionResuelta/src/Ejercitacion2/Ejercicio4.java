package Ejercitacion2;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio4 {


    public void primerosCienNumeros(){
        //Comenzar a escribir código acá
        for(Integer i = 0 ; i < 100 ; i++){

            //Imprimo por pantalla los numeros
            System.out.println((i*2) + 1);
        }
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        //Test
        Ejercicio4 ejercicio4 = new Ejercicio4();
        ejercicio4.primerosCienNumeros();
    }
}