package Ejercitacion2;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio5 {

    public Boolean contieneLetraA(String unTexto){
        //Comenzar a escribir código acá

        for(Integer i = 0; i < unTexto.length(); i++){
            if( unTexto.charAt(i) == 'a'){
                return true;
            }
        }
        // Si recorrio t odo el texto y no encontro la A, entonces devuelve false
        return false;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio5 ejercicio5 = new Ejercicio5();
        //Test 1
        System.out.println(ejercicio5.contieneLetraA("hello world"));
        //Test 2
        System.out.println(ejercicio5.contieneLetraA("zanahoria"));
        //Test 3
        System.out.println(ejercicio5.contieneLetraA("probando mi funcion"));
    }
}

