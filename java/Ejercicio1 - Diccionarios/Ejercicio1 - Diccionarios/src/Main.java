import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> diccionario = new HashMap<>();
        diccionario.put(0,"Huevos");
        diccionario.put(1,"Agua");
        diccionario.put(2,"Pibe");
        diccionario.put(7,"Tu novia");
        diccionario.put(20,"La cama");
        diccionario.put(15,"Gato");

        for (Integer unaClave: diccionario.keySet()){
            System.out.println(unaClave + ": " + diccionario.get(unaClave));
        }

    }
}
