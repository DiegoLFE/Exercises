package Empleados;

/**
 * Created by digitalhouse on 21/03/17.
 */
public class EmpleadoPlazoFijo extends Empleado {
    //Atributos
    private Integer cantMeses;

    // Constructor
    public EmpleadoPlazoFijo(Double unSueldoBasico, Integer meses) {
        super(unSueldoBasico);
        cantMeses = meses;
    }

    public Integer getCantMeses() {
        return cantMeses;
    }
}
