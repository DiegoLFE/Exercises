/**
 * Created by digitalhouse on 23/03/17.
 */
public class InvitadoDH extends Invitado{
    // Métodos
    @Override
    public void comerTorta(){
        super.comerTorta();
        gritar();
    }

    private void gritar(){
        System.out.println("Viva la chiqui!!!");
    }
}
