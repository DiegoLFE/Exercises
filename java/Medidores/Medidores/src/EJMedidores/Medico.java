package EJMedidores;

import EJMedidores.Medidores.MedidorDePulso;
import EJMedidores.Medidores.Notificador;

public class Medico implements Alertable{
    // Atributos
    private String especialidad;

    // Constructor
    public Medico(String unaEspecialidad){
        especialidad = unaEspecialidad;
    }

    // Métodos
    public String getEspecialidad(){
        return especialidad;
    }

    @Override
    public void recibirAlerta(Notificador notificador) {
        if (notificador instanceof MedidorDePulso){
            MedidorDePulso medidorDePulso = (MedidorDePulso) notificador;
            Integer pulso = medidorDePulso.getPulso();
            System.out.println("Correcto, pulso: " + pulso);
        } else {
            System.out.println("He sido Alertado!");
        }
    }
}
