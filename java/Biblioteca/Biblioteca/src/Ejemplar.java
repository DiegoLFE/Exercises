/**
 * Created by digitalhouse on 30/03/17.
 */
public class Ejemplar {
    private Publicacion publicacion;
    private Integer nroEdicion;
    private String ubicacion;

    public Ejemplar(Publicacion publicacion, Integer nroEdicion, String ubicacion) {
        this.publicacion = publicacion;
        this.nroEdicion = nroEdicion;
        this.ubicacion = ubicacion;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public Integer getNroEdicion() {
        return nroEdicion;
    }

    public String getUbicacion() {
        return ubicacion;
    }


    @Override
    public boolean equals(Object obj) {
        Ejemplar unEjemplar = (Ejemplar) obj;
        return nroEdicion.equals(unEjemplar.getNroEdicion()) && ubicacion.equals(unEjemplar.getUbicacion());
    }

    @Override
    public String toString() {
        return "Ejemplar: " +
                "nroEdicion=" + nroEdicion +
                ", ubicacion='" + ubicacion;
    }
}
