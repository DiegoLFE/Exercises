package EJMedidores.Medidores;

import EJMedidores.Paciente;

/**
 * Created by digitalhouse on 30/03/17.
 */
public abstract class Medidor extends Notificador {
    // Atributos
    private Paciente paciente;

    // Constructor
    public Medidor(Paciente unPaciente){
        paciente = unPaciente;
    }

    //Métodos
    protected Paciente getPaciente(){
        return paciente;
    }

    public abstract void medir();
}
