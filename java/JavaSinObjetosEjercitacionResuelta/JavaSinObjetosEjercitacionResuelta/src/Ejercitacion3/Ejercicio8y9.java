package Ejercitacion3;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio8y9 {

    String reverso(String unaCadenaTexto){

        String reverso = "";
        for(Integer i = 0; i < unaCadenaTexto.length(); i++){
            reverso = unaCadenaTexto.charAt(i) + reverso;
        }
        return reverso;
    }

    Boolean palindromo(String unaCadenaTexto){

        //Utilizando la funcion que creamos anteriormente podemos definir si es palindromo
        return unaCadenaTexto.equals(reverso(unaCadenaTexto));
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio8y9 ejercicio8y9 = new Ejercicio8y9();
        //Test 1
        String string1 = "Caramba";
        System.out.println(ejercicio8y9.reverso(string1));
        System.out.println(ejercicio8y9.palindromo(string1));

        //Test 1
        String string2 = "anana";
        System.out.println(ejercicio8y9.reverso(string2));
        System.out.println(ejercicio8y9.palindromo(string2));

    }
}
