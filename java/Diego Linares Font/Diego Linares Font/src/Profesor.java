/**
 * Created by dh1 on 06/04/17.
 */
abstract class Profesor {
    private  String nombre;
    private String apellido;
    private  Integer antiguedad = 0;
    private  Integer codP;

    public Profesor(String nombre, String apellido, Integer codP) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codP = codP;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Integer getCodP() {
        return codP;
    }

    public void setCodP(Integer codP) {
        this.codP = codP;
    }
    public void igualdadDeProfesor(Profesor profesor){
        if(this.codP.equals(codP)){
            System.out.println("son profesores iguales");
        } else {
            System.out.println("no son profesores iguales");
        }
    }

}
