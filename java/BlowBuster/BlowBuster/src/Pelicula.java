import java.util.List;

/**
 * Created by digitalhouse on 27/03/17.
 */
public class Pelicula {
    //Atributos
    private String codigoIMDB;
    private String titulo;
    private Integer anioPublicacion;
    private String idiomasSubtitulos;

    //Constructor
    public Pelicula(String codigoIMDB, String titulo, Integer anioPublicacion, String idiomasSubtitulos) {
        this.codigoIMDB = codigoIMDB;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.idiomasSubtitulos = idiomasSubtitulos;
    }

    //Metodos
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "codigoIMDB='" + codigoIMDB + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", idiomasSubtitulos='" + idiomasSubtitulos + '\'' +
                '}';
    }
}
