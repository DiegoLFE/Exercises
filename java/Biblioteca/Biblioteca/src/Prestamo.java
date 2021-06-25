import java.util.Date;

/**
 * Created by digitalhouse on 30/03/17.
 */
public class Prestamo {
    private Ejemplar unEjemplar;
    private Socio unSocio;
    private Date fecha;

    public Prestamo(Ejemplar unEjemplar, Socio unSocio) {
        this.unEjemplar = unEjemplar;
        this.unSocio = unSocio;
        this.fecha = new Date();
    }

    @Override
    public String toString() {
        return "Prestamo: " +
                "unEjemplar=" + unEjemplar +
                ", unSocio=" + unSocio +
                ", fecha='" + fecha;
    }
}
