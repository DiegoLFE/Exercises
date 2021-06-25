import java.util.List;

/**
 * Created by digitalhouse on 30/03/17.
 */
public class SocioClasico extends Socio {

    public SocioClasico(String nombre, String apellido, Integer numeroID) {
        super(nombre, apellido, numeroID);
        super.setCantidadMaximaARetirar(3);
    }
}
