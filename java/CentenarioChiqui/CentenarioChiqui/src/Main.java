public class Main {

    public static void main(String[] args) {
        // Creo invitados
        Invitado invitado1 = new Invitado();
        Invitado invitado2 = new Invitado();
        Invitado invitado3 = new Invitado();
        Invitado invitado4 = new InvitadoDH();
        Invitado invitado5 = new InvitadoDH();
        Invitado invitado6 = new InvitadoDH();
        Invitado invitado7 = new InvitadoDH();

        // Creo Explotables
        Explotable explotable1 = new FuegoNormal("Boom!");
        Explotable explotable2 = new FuegoNormal("Kaboom!");
        Explotable explotable3 = new FuegoNormal("Pum!");
        Explotable explotable4 = new FuegoNormal("ChasquiBoom!");

        FuegoPack pack1 = new FuegoPack();
        pack1.agregarFuegoArtificial(explotable1);
        pack1.agregarFuegoArtificial(explotable2);

        FuegoPack pack2 = new FuegoPack();
        pack2.agregarFuegoArtificial(explotable3);
        pack2.agregarFuegoArtificial(explotable4);
        pack2.agregarFuegoArtificial(pack1);


        // Creo evento
        Evento unEvento = new Evento();

        // Agrego invitados al evento
        unEvento.agregarInvitado(invitado1);
        unEvento.agregarInvitado(invitado2);
        unEvento.agregarInvitado(invitado3);
        unEvento.agregarInvitado(invitado4);
        unEvento.agregarInvitado(invitado5);
        unEvento.agregarInvitado(invitado6);
        unEvento.agregarInvitado(invitado7);

        // Agrego explotables al evento
        unEvento.agregarExplotable(pack1);
        unEvento.agregarExplotable(pack2);
        unEvento.agregarExplotable(explotable1);


        // LLego el momento de soplar las velas
        unEvento.soplarVelas();

    }
}
