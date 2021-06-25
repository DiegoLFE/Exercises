import java.util.ArrayList;
import java.util.List;

/**
 * Created by dh1 on 06/04/17.
 */
public class DigitalManager {
    private List<Alumno> listaAlumnos= new ArrayList<>();;
    private List<Profesor> listaProfesores= new ArrayList<>();;
    private List<Curso> listaCursos= new ArrayList<>();;
    private List<Inscripcion> listaInscripciones = new ArrayList<>();

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno){
        Alumno alumno = new Alumno(nombre,apellido,codigoAlumno);
        listaAlumnos.add(alumno);
    }

    public void altaCurso(String nombre, Integer codC, Integer cantidadMaximaAlumnos) {
        Curso curso1 = new Curso(nombre, codC, cantidadMaximaAlumnos);
        listaCursos.add(curso1);
    }

    public void bajaCurso(Integer codigoCurso) {
        for (Curso curso : listaCursos) {
            if (curso.getcodC().equals(codigoCurso)) {
                listaCursos.remove(curso);
            }
        }
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codP, Integer horasConsulta) {
        ProfesorAdjunto profesorAdjunto = new ProfesorAdjunto(nombre,apellido,codP,horasConsulta);
        listaProfesores.add(profesorAdjunto);
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        ProfesorTitular profesorTitular = new ProfesorTitular(nombre,apellido,codigoProfesor,especialidad);
        listaProfesores.add(profesorTitular);
    }

    public void bajaProfesor(Integer codigoProfesor) {
        for (Profesor profesor : listaProfesores) {
            if (profesor.getCodP().equals(codigoProfesor)) {
                listaProfesores.remove(profesor);
            }
        }
    }

    public void inscribirAlumno(Integer codA, Integer codC) {
        Curso cursoGuardado = null;
        for (Curso curso : listaCursos) {
            if (curso.getcodC().equals(codC)) {
                System.out.println("se encontro el curso");
                cursoGuardado = curso;
            }
        }
        Alumno alumnoGuardado = null;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCodA().equals(codA)) {
                System.out.println("se encontro el alumno");
                alumnoGuardado = alumno;
            }
        }

        if (cursoGuardado.agregarunAlumno(alumnoGuardado)){
            System.out.println("Se inscribio el alumno");
        Inscripcion inscripcion = new Inscripcion(alumnoGuardado, cursoGuardado);
        listaInscripciones.add(inscripcion);
        }
        System.out.println(" no hay cupo");
    }
    public void asignarProfesores(Integer codC, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto){
        ProfesorTitular profesorTitularGuardado = null;
        for (Profesor profesorTitular:listaProfesores) {
            if (profesorTitular.getCodP().equals(codigoProfesorTitular)){
                System.out.println("se encuentra en la lista");
                profesorTitularGuardado = (ProfesorTitular) profesorTitular;
            }
        }
        ProfesorAdjunto profesorAdjuntoGuardado = null;
        for ( Profesor profesorAdjunto : listaProfesores) {
            if (profesorAdjunto.getCodP().equals(codigoProfesorAdjunto)){
                System.out.println("se encuentra en la lista");
                profesorAdjuntoGuardado = (ProfesorAdjunto) profesorAdjunto;
            } else {
                System.out.println(" no se encuentra en la lista");
            }
        }
        Curso cursoGuardado = null;
        for(Curso curso : listaCursos) {
            if (curso.getcodC().equals(codC)) {
                System.out.println(" se encontro curso");
                cursoGuardado = curso;
            } else {
                System.out.println(" no se encontro curso");
            }
        }
        cursoGuardado.setProfesorAdjunto(profesorAdjuntoGuardado, codigoProfesorAdjunto);
        cursoGuardado.setProfesorTitular(profesorTitularGuardado,codigoProfesorTitular);

    }


}


