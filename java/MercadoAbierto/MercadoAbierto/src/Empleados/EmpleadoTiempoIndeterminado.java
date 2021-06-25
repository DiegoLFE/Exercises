package Empleados;

/**
 * Created by digitalhouse on 21/03/17.
 */
public class EmpleadoTiempoIndeterminado extends Empleado {
    // Atributos
    private Integer antiguedad = 0;
    private Integer hijos = 0;

    // Constructor
    public EmpleadoTiempoIndeterminado(Double unSueldoBasico, Integer cantHijos, Integer unaAntiguedad) {
        super(unSueldoBasico);
        antiguedad = unaAntiguedad;
        hijos = cantHijos;
    }

    // Métodos
    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setHijos(Integer hijos) {
        this.hijos = hijos;
    }

    @Override
    public Double getSueldo(){
        Integer suplementoPorHijo = Math.min(200 * hijos, 1000);
        Integer suplementoPorAntiguedad = Math.min(100 * antiguedad, 500);
        return super.getSueldo() + suplementoPorAntiguedad + suplementoPorHijo;
    }
}
