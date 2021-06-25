package Cliente;

/**
 * Created by digitalhouse on 13/03/17.
 */
public class ClienteEmpresa extends Cliente{

    //ATRIBUTOS
    private String nombreDeFantasia;
    private Integer cuit;

    //CONSTRUCTOR
    public ClienteEmpresa(String unNombre, Integer unCuit){
        nombreDeFantasia = unNombre;
        cuit = unCuit;
    }

    //METODOS
    public String getNombreDeFantasia(){
        return nombreDeFantasia;
    }

    public Integer getCUIT(){
        return cuit;
    }
}
