import java.util.DoubleSummaryStatistics;

/**
 * Created by digitalhouse on 16/03/17.
 */
public class EmpleadoLimpiezaVajilla extends EmpleadoDeLimpieza {

    private Integer roturas;


    //SI EL PADRE TIENE UN CONSTRUCTOR EL HIJO TIENE QUE TENER UN CONSTRUCTOR CON A LO SUMO LOS MISMOS PARAMETROS
    public EmpleadoLimpiezaVajilla(String nombre, String apellido, Double sueldoBase){
        super(nombre, apellido, sueldoBase);
        roturas = 0;
    }


    public void romperVajilla(){
        roturas ++;
    }

    public Integer getRoturas (){
        return roturas;
    }

    //Sobreescribimos getSueldo porque en este caso, hay que restar las roturas al sueldo fijo.
    @Override
    public Double cobrarSueldo() {
        //Se descuentan 5 frijoles mágicos por cada rotura.
        // Le pido a la clase padre el sueldo base, y le resto las roturas.
        Double sueldoFinal = super.cobrarSueldo() - roturas * 5;

        //OTRA OPCION PODRIA SER PONER LA VARIABLE sueldoBase en PROTECTED y el codigo seria:
        // Double sueldoFinal = sueldoBase - roturas * 5;

        return sueldoFinal;
    }
















}
