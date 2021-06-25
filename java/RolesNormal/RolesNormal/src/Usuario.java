import java.util.ArrayList;

/**
 * Created by digitalhouse on 15/03/17.
 */
public class Usuario {
    //Atributos
    private ArrayList<Rol> roles = new ArrayList<>();
    private ArrayList<Permiso> permisos = new ArrayList<>();


    //Métodos
    public void agregarPermiso(Permiso permiso){
        permisos.add(permiso);
    }

    public void agregarRol(Rol rol){
        roles.add(rol);
    }

    public Boolean puedeRealizar(String tarea){
        Boolean puede = false;

        // Recorro el array de roles
        for (Integer i = 0; i < roles.size(); i++){
            // Si la variable "puede" se vuelve "true" en algun momento; ya esta!
            if (!puede){
                Rol rol = roles.get(i);
                puede = rol.puedeRealizar(tarea);
            }
        }

        // Si ya puede, devuelvo true;
        if (!puede){

            // Recorro el array de permisos
            for (Integer i = 0; i < permisos.size(); i++){
                // Si la variable "puede" se vuelve "true" en algun momento; ya esta!
                if (!puede){
                    Permiso permiso = permisos.get(i);
                    puede = permiso.puedeRealizar(tarea);
                }
            }

            return puede;
        } else {
            return true;
        }
    }
}
