/**
 * Created by digitalhouse on 16/03/17.
 */
public class EmpleadoDeLimpieza {

    private String nombre;
    private String apellido;
    private Double sueldoBase;

    public EmpleadoDeLimpieza(String nombre, String apellido, Double sueldoBase){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBase = sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Double cobrarSueldo() {
        return sueldoBase;
    }

    public void setSueldoBase(Double unSueldoBase){
        sueldoBase = unSueldoBase;
    }















}
