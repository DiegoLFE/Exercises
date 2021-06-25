/**
 * Created by digitalhouse on 22/03/17.
 */
public class Pasajero {
    // Atributos
    private Boolean prefIrSentado;           // Preferencia del pasajero de ir sentado. Si es True entonces solo puede ir sentado.

    //Constructor
    public Pasajero(Boolean unaPreferencia){
        prefIrSentado = unaPreferencia;      // Inicailizo la preferencia del pasajero cuando instancio un pasajero.
    }

    // Metodos
    public void setPrefIrSentado(Boolean prefIrSentado) {
        this.prefIrSentado = prefIrSentado;  // Permite modificar mi atributo preferencia del pasajero.
    }

    public Boolean getPrefIrSentado(){
        return prefIrSentado;                // Informa acerca de la preferencia del pasajero.
    }
}
