import java.util.Date;
import java.util.List;

/**
 * Created by digitalhouse on 30/03/17.
 */
public class SocioVip extends Socio {
    private Double cuotaMensual;

    public SocioVip(String nombre, String apellido, Integer numeroID, Double cuotaMensual) {
        super(nombre, apellido, numeroID);
        super.setCantidadMaximaARetirar(15);
        this.cuotaMensual = cuotaMensual;
    }
}
