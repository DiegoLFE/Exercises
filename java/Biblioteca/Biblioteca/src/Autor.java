/**
 * Created by digitalhouse on 31/03/17.
 */
public class Autor {
    private String nombre;

    public Autor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
