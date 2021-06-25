package FB.Posts;

public class PostDeVideo extends Post {
    // Métodos
    public String mostrar() {
        return "Video: " + contenidoGrande + " autor:" + autor.getNombre();
    }
    public String mostrarEnTimeline() {
        return "Video: " + contenidoChico + " autor:" + autor.getNombre();
    }
}