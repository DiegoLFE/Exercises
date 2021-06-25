package FB;

import FB.Posts.Post;

import java.util.ArrayList;
import java.util.List;

public class Timeline implements ObservadorDeNuevosPosts {
    // Atributos
    private List<TimelineItem> posts = new ArrayList<>();

    // Métodos
    public void agregarPost(Post unPost) {
        posts.add(new TimelineItem(unPost));
    }

    public void mostrar() {
        for(TimelineItem item : posts) {
            System.out.println(item.getPost().mostrarEnTimeline() + " - " + item.getFecha());
        }
    }

    @Override
    public void ocurrioUnCambio(Post unPost) {
        agregarPost(unPost);
        System.out.println("Se agrego un post de " + unPost.getAutor().getNombre() + " a la timeline");
    }
}
