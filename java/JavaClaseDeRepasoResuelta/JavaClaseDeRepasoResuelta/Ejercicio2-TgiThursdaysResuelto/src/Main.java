import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //CREO UN EMPLEADO DE LIMPIEZA
        EmpleadoDeLimpieza andres = new EmpleadoDeLimpieza("Andres","F",1000.0);

        //CREO UN EMPLEADO DE LIMPIEZA DE VAJILLA
        EmpleadoLimpiezaVajilla nicolas = new EmpleadoLimpiezaVajilla("Nico","F", 500.0);
        nicolas.romperVajilla();
        nicolas.romperVajilla();

        //CREO UNA LISTA DE EMPLEADOS
        ArrayList<EmpleadoDeLimpieza> empleados = new ArrayList<>();
        empleados.add(andres);
        empleados.add(nicolas);


        //CREO UN RESTAURANT
        Restaurante restaurante = new Restaurante(empleados);
        restaurante.liquidarSueldosDeEmpleadosDeLimpieza();

    }
}
