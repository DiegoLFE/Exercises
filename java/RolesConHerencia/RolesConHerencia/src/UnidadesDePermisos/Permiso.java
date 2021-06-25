package UnidadesDePermisos;

/**
 * Created by digitalhouse on 15/03/17.
 */
public class Permiso extends UnidadDePermiso{
    //Atributos
    private String tarea;

    //Método
    public void setTarea(String tarea){
        this.tarea = tarea;
    }

    public Boolean puedeRealizar(String unaTarea){
        return tarea.equals(unaTarea);
    }
}
