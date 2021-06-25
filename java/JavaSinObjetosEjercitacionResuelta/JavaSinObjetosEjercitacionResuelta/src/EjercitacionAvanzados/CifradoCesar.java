package EjercitacionAvanzados;

/**
 * Created by digitalhouse on 12/08/16.
 */
/**
 * Created by andres on 31/03/16.
 */
public class CifradoCesar {

    public String cifrar(String texto, Integer desplazamiento){
        //Comenzar a escribir código acá

        return "";
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        CifradoCesar cifradoCesar = new CifradoCesar();
        //Test 1
        System.out.println(cifradoCesar.cifrar("hello world",3));
        //Test 2
        System.out.println(cifradoCesar.cifrar("casa",10));
        //Test 3
        System.out.println(cifradoCesar.cifrar("probando el cifrado cesar", 7));
    }


    public static Integer charToNumberValue(Character word){

        Integer asciiCode = (int) word  - 97;
        return asciiCode;
    }

    public static Character numberValueToChar(Integer numberValue){

        Character word =  Character.toChars(numberValue+97)[0];
        return word;
    }
}