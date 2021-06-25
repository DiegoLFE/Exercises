/**
 * Created by digitalhouse on 13/03/17.
 */
public class Balde {

    //Atributos
    private Integer cantidad;

    //Métodos
    public Integer arrojarAgua(){
        //Guardo el agua que hay en el balde
        Integer cantidadDeAgua = cantidad;

        //Vacío el balde
        cantidad = 0;

        //Devuelvo la cantidad de agua que había en el balde
        return cantidadDeAgua;
    }

    //Setea la cantidad de agua que va a tener el balde
    public void setCantidad(Integer cantidadACargar) {
        cantidad = cantidadACargar;
    }
}
