import java.util.List;

/**
 * Created by digitalhouse on 30/03/17.
 */
public class Libro extends Publicacion implements Imprimible{
    private Autor autor;

    public Libro(String nombre, Integer codigoISBN, String fechaPublicacion, Autor autor) {
        super(nombre, codigoISBN, fechaPublicacion);
        this.autor = autor;
    }

    @Override
    public Ejemplar imprimir() {
        System.out.println(this.toString());
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "Libro{" +
                ", autor='" + autor + '\'' +
                '}';
    }
}
