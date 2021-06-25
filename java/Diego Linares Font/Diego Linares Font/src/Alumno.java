import java.util.Objects;

/**
 * Created by dh1 on 06/04/17.
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private Integer codA;

    public Alumno(String nombre, String apellido, Integer codA) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codA = codA;
    }
    public void igualdadDeAlumno(Alumno alumno){
        if(this.codA.equals(codA)){
            System.out.println("son alumnos iguales");
        } else {
            System.out.println("no son alumnos iguales");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getCodA() {
        return codA;
    }

    public void setCodA(Integer codA) {
        this.codA = codA;
    }

    @Override
    public boolean equals(Object o) {
        Alumno alumno = (Alumno) o;
        return codA.equals(alumno.getCodA());
    }
}
