package FB.Posts;

import FB.Usuario;

public class Post {
    // Atributos
    protected Usuario autor;
    protected String contenidoGrande;
    protected String contenidoChico;

    // Métodos
    public void setAutor(Usuario user) {
        autor = user;
    }

    public void setContenido(String contenido) {
        contenidoGrande = contenido + " version grande";
        contenidoChico = contenido + " version chiquita";
    }

    public String mostrar() {
        return contenidoGrande + " autor:" + autor.getNombre();
    }

    public String mostrarEnTimeline() {
        return contenidoChico + " autor:" + autor.getNombre();
    }

    public Usuario getAutor() {
        return autor;
    }
}