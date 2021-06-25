import java.util.ArrayList;

/**
 * Created by digitalhouse on 16/03/17.
 */
public class Restaurante {
    
    private ArrayList<EmpleadoDeLimpieza> empleadosDeLimpieza;

    public Restaurante(ArrayList<EmpleadoDeLimpieza> empleadosDeLimpieza) {
        //El constructor recibe como parámetro la lista de empleados
        this.empleadosDeLimpieza = empleadosDeLimpieza;
    }

    public Double liquidarSueldosDeEmpleadosDeLimpieza (){
        //Este método devolverá el total de los sueldos a liquidar.
        Double totalSueldosALiquidar = 0.0;

        //Iteramos por los sueldos de todos los empleados
        for (Integer i = 0; i < empleadosDeLimpieza.size(); i++) {
             totalSueldosALiquidar += empleadosDeLimpieza.get(i).cobrarSueldo();
            System.out.println("El empleado " + empleadosDeLimpieza.get(i).getNombre() + " cobra " + empleadosDeLimpieza.get(i).cobrarSueldo());
        }

        System.out.println("El total de sueldos pagados es : " + totalSueldosALiquidar);
        return totalSueldosALiquidar;
    }
}
