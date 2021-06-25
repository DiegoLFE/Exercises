package UnidadesDePermisos;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 15/03/17.
 */
public class Rol extends UnidadDePermiso{
    //Atributos
    private ArrayList<UnidadDePermiso> unidades = new ArrayList<>();

    //Métodos
    public void agregarUnidadDePermiso(UnidadDePermiso unidad){
        unidades.add(unidad);
    }

    public Boolean puedeRealizar(String tarea){
        Boolean puede = false;

        // Recorro el array de unidades
        for(Integer i = 0; i < unidades.size(); i++){
            // Si la variable "puede" se vuelve "true" en algun momento; ya esta!
            if (!puede){
                UnidadDePermiso unidad = unidades.get(i);
                puede = unidad.puedeRealizar(tarea);
            }
        }

        // Devuelvo si puede o no
        return puede;
    }
}
