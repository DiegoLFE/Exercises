import java.util.List;

/**
 * Created by digitalhouse on 27/03/17.
 */
public class Dvd extends Pelicula implements Prestable{
    //Atributos
    private Integer nroZona;
    private Boolean prestado;

    //Constructor
    public Dvd(String codigoIMDB, String titulo, Integer anioPublicacion, String idiomasSubtitulos, Integer nroZona, Boolean prestado) {
        super(codigoIMDB, titulo, anioPublicacion, idiomasSubtitulos);
        this.nroZona = nroZona;
        this.prestado = prestado;
    }

    //Metodos
    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public void prestar() {
        //Pongo el atributo prestado en true
        prestado = true;
    }

    @Override
    public void devolver() {
        //Pongo el atributo prestado en false
        prestado = false;
    }

    @Override
    public Boolean prestado() {
        //Devuelvo el valor del atributo prestado
        return prestado;
    }

    @Override
    public String toString() {
        return super.toString() + "Dvd{" +
                "nroZona=" + nroZona +
                ", prestado=" + prestado +
                '}';
    }
}
