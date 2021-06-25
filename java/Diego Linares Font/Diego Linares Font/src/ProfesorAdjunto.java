/**
 * Created by dh1 on 06/04/17.
 */
public class ProfesorAdjunto extends  Profesor {
    private Integer horasConsulta;

    public Integer getHorasConsulta() {
        return horasConsulta;
    }

    public void setHorasConsulta(Integer horasConsulta) {
        this.horasConsulta = horasConsulta;
    }

    @Override
    public void setAntiguedad(Integer antiguedad) {
        super.setAntiguedad(antiguedad);
    }

    public ProfesorAdjunto(String nombre, String apellido,  Integer codP, Integer horasConsulta) {
        super(nombre, apellido, codP);
        this.horasConsulta = horasConsulta;
    }
}
