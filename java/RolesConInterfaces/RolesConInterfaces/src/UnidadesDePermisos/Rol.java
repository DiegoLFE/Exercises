package UnidadesDePermisos;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 15/03/17.
 */
public class Rol implements Permisible{
    //Atributos
    private ArrayList<Permiso> permisos = new ArrayList<>();


    //Métodos
    public void agregarPermiso(Permiso permiso){
        permisos.add(permiso);
    }

    public Boolean puedeRealizar(String tarea){
        Boolean puede = false;

        // Recorro el array de permisos
        for(Integer i = 0; i < permisos.size(); i++){
            // Si la variable "puede" se vuelve "true" en algun momento; ya esta!
            if (!puede){
                Permiso permiso = permisos.get(i);
                puede = permiso.puedeRealizar(tarea);
            }
        }

        // Devuelvo si puede o no
        return puede;
    }
}
