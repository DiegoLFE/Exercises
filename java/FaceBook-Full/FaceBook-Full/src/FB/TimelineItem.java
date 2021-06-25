package FB;

import FB.Posts.Post;

import java.util.Date;

public class TimelineItem {
    // Atributos
    private Post post;
    private Date fecha;

    // Constructor
    public TimelineItem(Post unPost) {
        post = unPost;
        fecha = new Date();
    }

    // Métodos
    public Post getPost() {
        return post;
    }
    public String getFecha() {
        return fecha.toString();
    }
}

