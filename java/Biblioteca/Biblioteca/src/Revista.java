import java.util.List;

/**
 * Created by digitalhouse on 31/03/17.
 */
public class Revista extends Publicacion{
    private Autor autor;

    public Revista(String nombre, Integer codigoISBN, String fechaPublicacion, Autor autor) {
        super(nombre, codigoISBN, fechaPublicacion);
        this.autor = autor;
    }
}
