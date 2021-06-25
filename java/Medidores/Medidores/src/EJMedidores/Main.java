package EJMedidores;

import EJMedidores.Medidores.MedidorDePulso;

public class Main {

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        MedidorDePulso medidorDePulso = new MedidorDePulso(paciente1);

        Medico medico1 = new Medico("Neurocirujano");
        Medico medico2 = new Medico("Oncologo");

        medidorDePulso.suscribir(medico1);
        medidorDePulso.suscribir(medico2);

        medidorDePulso.medir();
    }
}
