import java.util.List;

/**
 * Created by digitalhouse on 27/03/17.
 */
public class BluRay extends Pelicula implements Prestable{
    //Atributos
    private Boolean prestado;

    //Constructor
    public BluRay(String codigoIMDB, String titulo, Integer anioPublicacion, String idiomasSubtitulos, Boolean prestado) {
        super(codigoIMDB, titulo, anioPublicacion, idiomasSubtitulos);
        this.prestado = prestado;
    }

    //Metodos
    public Boolean getPrestado() {
        return prestado;
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
        return super.toString() + "BluRay{" +
                "prestado=" + prestado +
                '}';
    }
}
