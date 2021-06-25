package EJMedidores;

import EJMedidores.Medidores.Notificador;

/**
 * Created by digitalhouse on 30/03/17.
 */
public interface Alertable {
    public void recibirAlerta(Notificador notificador);
}
