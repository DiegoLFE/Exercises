package Empleados;

/**
 * Created by digitalhouse on 21/03/17.
 */
public abstract class Empleado {
    // Atributos
    private Double sueldoBasico;

    // Constructor
    public Empleado(Double unSueldoBasico){
        sueldoBasico = unSueldoBasico;
    }

    // Métodos
    public Double getSueldo(){
        return sueldoBasico;
    }
}
