package EJMedidores.Medidores;

import EJMedidores.Paciente;

/**
 * Created by digitalhouse on 30/03/17.
 */
public class MedidorDePulso extends Medidor{
    // Atributos
    private Integer pulso;

    // Constructor
    public MedidorDePulso(Paciente unPaciente){
        super(unPaciente);
    }

    // Métodos
    public Integer getPulso() {
        return pulso;
    }

    @Override
    public void medir() {
        pulso = getPaciente().getPulso();
        if (pulso < 20) {
            emitirAlerta();
        }
    }
}
