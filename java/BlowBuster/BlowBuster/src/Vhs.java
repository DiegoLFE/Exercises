import java.util.List;

/**
 * Created by digitalhouse on 27/03/17.
 */
public class Vhs extends Pelicula implements Usable{
    //Atributos
    private String fecha;
    private Boolean usado;

    //Constructor
    public Vhs(String codigoIMDB, String titulo, Integer anioPublicacion, String idiomasSubtitulos, String fecha, Boolean usado) {
        super(codigoIMDB, titulo, anioPublicacion, idiomasSubtitulos);
        this.fecha = fecha;
        this.usado = usado;
    }
    //Metodos
    @Override
    public String toString() {
        return super.toString() + "Vhs{" +
                "fecha='" + fecha + '\'' +
                ", usado=" + usado +
                '}';
    }

    @Override
    public Boolean usado() {
        //Devuelvo el valor del atributo usado
        return usado;
    }
}
