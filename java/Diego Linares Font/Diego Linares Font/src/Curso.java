import java.util.ArrayList;
import java.util.List;

/**
 * Created by dh1 on 06/04/17.
 */
public class Curso {
    private String nombre;
    private Integer codC;
    private ProfesorTitular profesorTitular;
    private  ProfesorAdjunto profesorAdjunto;
    List<Alumno> listaAlumnos = new ArrayList<>();
    private Integer cantidadMaximaAlumnos;

    public Curso(String nombre, Integer codC, Integer cantidadMaximaAlumnos) {
        this.nombre = nombre;
        this.codC = codC;
        this.cantidadMaximaAlumnos = cantidadMaximaAlumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getcodC() {
        return codC;
    }

    public void setCodA(Integer codC) {
        this.codC = codC;
    }

    public void igualdadDeCurso(Curso curso) {
        if (this.codC.equals(codC)) {
            System.out.println("son cursos iguales");
        } else {
            System.out.println("son cursos distintos");
        }
    }
    public void setCantidadMaximaAlumnos(Integer CantidadMaximaAlumnos) {
        this.cantidadMaximaAlumnos = CantidadMaximaAlumnos;
    }

    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public ProfesorTitular getProfesorTitular() {
        return profesorTitular;
    }

    public void setProfesorTitular(ProfesorTitular profesorTitular, Integer codigoProfesorTitular) {
        this.profesorTitular = profesorTitular;
    }

    public ProfesorAdjunto getProfesorAdjunto() {
        return profesorAdjunto;
    }

    public void setProfesorAdjunto(ProfesorAdjunto profesorAdjunto, Integer codigoProfesorAdjunto) {
        this.profesorAdjunto = profesorAdjunto;
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }
    public Boolean agregarunAlumno(Alumno unAlumno){
        if (listaAlumnos.size()<cantidadMaximaAlumnos){
            listaAlumnos.add(unAlumno);
            return true;
        } else {
            return false;
        }

    }
    public void eliminarAlumno(Alumno unAlumno){
        listaAlumnos.remove(unAlumno);
    }
    @Override
    public boolean equals(Object o) {
        Curso curso = (Curso) o;
        return codC.equals(curso.getcodC());
    }
}
