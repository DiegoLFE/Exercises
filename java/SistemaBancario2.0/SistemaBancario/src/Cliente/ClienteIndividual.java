package Cliente;

/**
 * Created by digitalhouse on 11/03/17.
 */
public class ClienteIndividual extends Cliente{

    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private Integer dni;

    //CONSTRUCTOR
    public ClienteIndividual(String unNombre, String unApellido, int numDni){
        nombre = unNombre;
        apellido = unApellido;
        dni = numDni;
    }

    //EJEMPLO DE GETTER
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public Integer getDNI(){
        return dni;
    }

    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }
}
