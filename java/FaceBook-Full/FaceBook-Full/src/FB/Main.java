package FB;

/**
 * Created by digitalhouse on 29/03/17.
 */
public class Main {
    public static void main(String[] args){
        Usuario jose = new Usuario();
        jose.setNombre("Jose");

        Usuario demian = new Usuario();
        demian.setNombre("Demian");

        jose.agregarAmigo(demian);

        Usuario mariano = new Usuario();
        mariano.setNombre("Mariano");

        jose.agregarAmigo(mariano);

        jose.crearPostDeTexto("soy genial y me gusta publicarlo en FB!");

        jose.crearPostDeVideo("soy tremendo y me gusta publicar vieos en FB!");

        demian.verTimeline();
        mariano.verTimeline();
    }
}
