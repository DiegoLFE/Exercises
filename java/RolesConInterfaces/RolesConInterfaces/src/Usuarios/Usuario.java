package Usuarios;

import UnidadesDePermisos.Permisible;


import java.util.ArrayList;

/**
 * Created by digitalhouse on 15/03/17.
 */
public class Usuario {
    //Atributos
    private ArrayList<Permisible> permisibles = new ArrayList<>();


    //Métodos
    public void agregarPermisible(Permisible permisible){
        permisibles.add(permisible);
    }

    public Boolean puedeRealizar(String tarea){
        Boolean puede = false;

        // Recorro el array de permisibles
        for (Integer i = 0; i < permisibles.size(); i++){
            // Si la variable "puede" se vuelve "true" en algun momento; ya esta!
            if (!puede){
                Permisible permisible = permisibles.get(i);
                puede = permisible.puedeRealizar(tarea);
            }
        }

        // Devuelvo si puede o no
        return puede;
    }
}
