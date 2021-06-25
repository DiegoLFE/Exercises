import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 31/03/17.
 */
public class Publicacion {
    private String nombre;
    private Integer codigoISBN;
    private String fechaPublicacion;
    private List<Ejemplar> listaDeEjemplares;

    public Publicacion(String nombre, Integer codigoISBN, String fechaPublicacion) {
        this.nombre = nombre;
        this.codigoISBN = codigoISBN;
        this.fechaPublicacion = fechaPublicacion;
        this.listaDeEjemplares = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigoISBN() {
        return codigoISBN;
    }

    public List<Ejemplar> getListaDeEjemplares() {
        return listaDeEjemplares;
    }

    public void agregarEjemplar(Ejemplar unEjemplar){
        listaDeEjemplares.add(unEjemplar);
    }

    public Boolean tieneEjemplaresDisponibles(){
        return listaDeEjemplares.size()>0;
    }

    public Ejemplar prestarEjemplar(){
        return listaDeEjemplares.remove(0);
    }

    public void reingresar(Ejemplar unEjemplar){
        listaDeEjemplares.add(unEjemplar);
        System.out.println("Reingreso el ejemplar "+ unEjemplar.getNroEdicion() + " de " + unEjemplar.getPublicacion().getNombre());
    }

    @Override
    public boolean equals(Object obj) {
        Publicacion publicacion = (Publicacion) obj;
        return codigoISBN.equals(publicacion.getCodigoISBN());
    }

    @Override
    public String toString() {
        return "Publicacion:" +
                "codigoISBN=" + codigoISBN +
                ", fechaPublicacion='" + fechaPublicacion + '\'' +
                ", listaDeEjemplares=" + listaDeEjemplares;
    }
}
