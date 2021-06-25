package FB;

import FB.Posts.Post;

import java.util.HashSet;
import java.util.Set;

public abstract class NotificadorDeNuevosPosts {
    // Atributos
    private Set<ObservadorDeNuevosPosts> observers = new HashSet<>();

    // Métodos
    public void notificarCambio(Post unPost) {
        for(ObservadorDeNuevosPosts unObserver : observers)
        {
            unObserver.ocurrioUnCambio(unPost);
        }
    }

    public void agregarObserver(ObservadorDeNuevosPosts unObserver){
        observers.add(unObserver);
    }

}
