/**
 * Created by digitalhouse on 23/03/17.
 */
public class FuegoNormal implements Explotable{
    // Atributos
    private String ruido;

    // Constructor
    public FuegoNormal(String unRuido){
        ruido = unRuido;
    }

    // Método
    public void explotar(){
        System.out.println(ruido);
    }
}
