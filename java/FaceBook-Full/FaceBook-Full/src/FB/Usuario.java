package FB;

import FB.Posts.Post;
import FB.Posts.PostDeVideo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Usuario extends NotificadorDeNuevosPosts implements ObservadorDeNuevosPosts {
    // Atributos
    private Set<Usuario> amigos = new HashSet<>();
    private List<Post> posts = new ArrayList<>();
    private Timeline timeline = new Timeline();
    private String nombre;

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreUsuario) {
        nombre = nombreUsuario;
    }

    public void getPosts() {
        System.out.println("Lista de posts de: " + this.getNombre());
        for(Post post : posts)
        {
            System.out.println(post.mostrarEnTimeline());
        }
    }

    public void verTimeline() {
        System.out.println("Timeline de: " + this.getNombre());
        timeline.mostrar();
    }

    public Timeline getTimeline() {
        return timeline;
    }

    public void crearPostDeTexto(String contenido) {
        Post post = new Post();
        post.setAutor(this);
        post.setContenido(contenido);
        this.posts.add(post);
        this.notificarCambio(post);
    }

    public void crearPostDeVideo(String contenido) {
        PostDeVideo post = new PostDeVideo();
        post.setAutor(this);
        post.setContenido(contenido);
        this.posts.add(post);
        this.notificarCambio(post);
    }

    public void agregarAmigo(Usuario amigo) {
        amigos.add(amigo);
        this.agregarObserver(amigo);
        this.agregarObserver(amigo.getTimeline());
    }

    public void ocurrioUnCambio(Post unPost) {
        System.out.println("Alerta para " + this.nombre + ": Algun amigo posteo algo nuevo!");
    }
}
