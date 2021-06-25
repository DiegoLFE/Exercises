import Empleados.EmpleadoComision;
import Empleados.EmpleadoPlazoFijo;
import Empleados.EmpleadoTiempoIndeterminado;
import Ventas.Venta;

/**
 * Created by digitalhouse on 21/03/17.
 */
public class Test {
    public static void main(String[] args){
        // Creo empleados
        EmpleadoTiempoIndeterminado empleadoTiempoIndeterminado = new EmpleadoTiempoIndeterminado(3000.,2, 3);
        EmpleadoPlazoFijo empleadoPlazoFijo = new EmpleadoPlazoFijo(2000., 6);
        EmpleadoComision empleadoComision = new EmpleadoComision(3000.);

        // Creo ventas
        Venta venta1 = new Venta(3000., 1500.);
        Venta venta2 = new Venta(1000., 500.);
        Venta venta3 = new Venta(9000., 5000.);

        // Registro que el empleado por comision hizo las siguientes ventas
        empleadoComision.registrarVenta(venta1);
        empleadoComision.registrarVenta(venta2);
        empleadoComision.registrarVenta(venta3);

        // Imprimo el calculo de sueldo de c/u
        System.out.println("Sueldo empleadoIndeterminado: " + empleadoTiempoIndeterminado.getSueldo());
        System.out.println("Sueldo empleadoComision: " + empleadoComision.getSueldo());
        System.out.println("Sueldo empleadoPlazoFijo: " + empleadoPlazoFijo.getSueldo());
    }
}
