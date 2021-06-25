import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 30/03/17.
 */
public abstract class Socio {
    private String nombre;
    private String apellido;
    private Integer numeroID;
    private List<Ejemplar> ejemplaresRetirados;
    private Integer cantidadMaximaARetirar;

    public Socio(String nombre, String apellido, Integer numeroID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroID = numeroID;
        this.ejemplaresRetirados = new ArrayList<>();
    }

    public void setCantidadMaximaARetirar(Integer cantidadMaximaARetirar) {
        this.cantidadMaximaARetirar = cantidadMaximaARetirar;
    }

    public Boolean tieneCupoDisponible(){

        return cantidadMaximaARetirar > ejemplaresRetirados.size();
    }

    public void tomarPrestadoUnEjemplar(Ejemplar unEjemplar){
        ejemplaresRetirados.add(unEjemplar);
    }

    public Ejemplar devolverUnEjemplar(Ejemplar unEjemplar){
        Ejemplar ejemplarARetirar = null;
        for (Ejemplar ejemplar:ejemplaresRetirados) {
            if (ejemplar.getPublicacion().getCodigoISBN().equals(unEjemplar.getPublicacion().getCodigoISBN())){
                ejemplarARetirar = ejemplar;
            }
        }
        if (ejemplarARetirar!=null){
            System.out.println("El socio " + this.getNombre() + " devolvio el ejemplar " + unEjemplar.getNroEdicion() + " de " + unEjemplar.getPublicacion().getNombre());
            ejemplaresRetirados.remove(ejemplarARetirar);
            return ejemplarARetirar;
        }
        System.out.println("no se encontró el ejemplar, no se pudo devolver");
        return ejemplarARetirar;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNumeroID() {
        return numeroID;
    }

    @Override
    public String toString() {
        return "Socio: " +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroID=" + numeroID +
                ", ejemplaresRetirados=" + ejemplaresRetirados +
                ", cantidadMaximaARetirar=" + cantidadMaximaARetirar;
    }
}

