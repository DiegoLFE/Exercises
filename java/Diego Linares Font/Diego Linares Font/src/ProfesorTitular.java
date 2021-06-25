/**
 * Created by dh1 on 06/04/17.
 */
public class ProfesorTitular extends Profesor {
    private String especialidad;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void setAntiguedad(Integer antiguedad) {
        super.setAntiguedad(antiguedad);
    }

    public ProfesorTitular(String nombre, String apellido, Integer codP, String especialidad) {
        super(nombre, apellido, codP);
        this.especialidad = especialidad;
    }
}
