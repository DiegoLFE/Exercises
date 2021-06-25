import java.util.List;

public class Main {

    public static void main(String[] args) {
        Alumno alumno = new Alumno("carlitos","gomez",1);
        Alumno alumno1 = new Alumno("caren","ibram",2);
        Alumno alumno2 = new Alumno("lucho","goz",3);
        Profesor profesor = new ProfesorAdjunto("manuel","rodriguez",1,4);
        Profesor profesor1 = new ProfesorAdjunto("jorge","perez",2,45);
        Profesor profesor2 = new ProfesorTitular("carlos","much",3,"biologia");
        Profesor profesor3 = new ProfesorTitular("marcelo","muche",4,"matematica");





        DigitalManager digitalManager = new DigitalManager();
        digitalManager.altaProfesorAdjunto("manuel","rodriguez",1,4);
        digitalManager.altaProfesorAdjunto("jorge","perez",2,45);
        digitalManager.altaProfesorTitular("carlos","much",3,"biologia");
        digitalManager.altaProfesorTitular("marcelo","muche",4,"matematica");
        digitalManager.altaCurso("Full Stack",20001,3);
        digitalManager.altaCurso("Android",20002,2);
        digitalManager.asignarProfesores(20001,3,1);
        digitalManager.asignarProfesores(20001,4,2);
        digitalManager.altaAlumno("carlitos","gomez",1);
        digitalManager.altaAlumno("caren","ibram",2);
        digitalManager.altaAlumno("lucho","goz",3);
        digitalManager.inscribirAlumno(1,20001);
        digitalManager.inscribirAlumno(2,20001);
        digitalManager.inscribirAlumno(3,20002);
        digitalManager.inscribirAlumno(1,20002);
        digitalManager.inscribirAlumno(1,20002);
       /* digitalManager.inscribirAlumno(2,20002);
        digitalManager.inscribirAlumno(3,20002);*/



//en la clase alumno le pondria un atributo Curso codigo integer y ese atributo lo agregaria a un metodo que sea get curso donde pasan el (codigo)
//cuando se inscriba a un alumno a un curso hay que pasarle el respectivo codigo

    }
}
