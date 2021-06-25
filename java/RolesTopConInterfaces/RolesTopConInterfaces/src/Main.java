import UnidadesDePermisos.Permiso;
import UnidadesDePermisos.Rol;
import Usuarios.Usuario;

public class Main {

    public static void main(String[] args) {

        //Creo Permisos
        Permiso entrarAlAula = new Permiso();
        entrarAlAula.setTarea("entrar al aula");

        Permiso pasarMolinete = new Permiso();
        pasarMolinete.setTarea("pasar molinete");

        Permiso ponerNota = new Permiso();
        ponerNota.setTarea("poner nota");

        //Creo un rol alumno y le asigno 1 permiso
        Rol alumno = new Rol();
        alumno.agregarPermisible(entrarAlAula);

        //Creo un rol profesor y le asigno 2 permisos y 1 Rol
        Rol profesor = new Rol();
        profesor.agregarPermisible(entrarAlAula);
        profesor.agregarPermisible(ponerNota);
        profesor.agregarPermisible(alumno); //Le estoy agregando 1 Rol dentro de 1 Rol

        // Creo un usuario y le asigno 1 rol y 1 permiso
        Usuario usuario = new Usuario();
        usuario.agregarPermisible(alumno);
        usuario.agregarPermisible(pasarMolinete);


        //Creo una tarea a consultar
        String tarea1 = "fumar en el aula";

        if (usuario.puedeRealizar(tarea1)){
            System.out.println("Puede " + tarea1);
        } else {
            System.out.println("No puede " + tarea1);
        }

        //Creo otra tarea a consultar
        String tarea2 = "pasar molinete";

        if (usuario.puedeRealizar(tarea2)){
            System.out.println("Puede " + tarea2);
        } else {
            System.out.println("No puede " + tarea2);
        }

        //Creo otra tarea a consultar
        String tarea3 = "poner nota";

        if (usuario.puedeRealizar(tarea3)){
            System.out.println("Puede " + tarea3);
        } else {
            System.out.println("No puede " + tarea3);
        }
    }
}
