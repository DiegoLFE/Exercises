import java.util.List;

/**
 * Created by digitalhouse on 31/03/17.
 */
public class Paper extends Publicacion implements Imprimible{
    private List<Autor> listaDeAutores;
    private String resumen;

    public Paper(String nombre, Integer codigoISBN, String fechaPublicacion, List<Autor> listaDeAutores, String resumen) {
        super(nombre, codigoISBN, fechaPublicacion);
        this.listaDeAutores = listaDeAutores;
        this.resumen = resumen;
    }

    @Override
    public Ejemplar imprimir() {
        System.out.println(this.toString());
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "Paper{" +
                "listaDeAutores=" + listaDeAutores +
                ", resumen='" + resumen + '\'' +
                '}';
    }
}
