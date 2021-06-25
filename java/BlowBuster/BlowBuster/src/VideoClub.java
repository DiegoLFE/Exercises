import java.util.List;

/**
 * Created by digitalhouse on 27/03/17.
 */
public class VideoClub {
    //Atributos
    List<Prestable> listaDePrestables;
    List<Usable> listaDeUsables;

    //Constructor
    public VideoClub(List<Prestable> listaDePrestables, List<Usable> listaDeUsables) {
        this.listaDePrestables = listaDePrestables;
        this.listaDeUsables = listaDeUsables;
    }

    //Metodos
    public void agregarPrestable(Prestable prestable){
        //Agrego un prestable a la lista de prestables
        listaDePrestables.add(prestable);
    }

    public void agregarUsable(Usable usable){
        //Agrego un usable a la lista de usables
        listaDeUsables.add(usable);
    }

    public void prestar(String tituloPelicula){
        //Recorro la lista de prestables
        for (Prestable peliculaAPrestar:listaDePrestables) {
            //Me guardo el prestable en una pelicula y lo casteo, solamente para poder comparar su atributo titulo
            Pelicula pelicula = (Pelicula)peliculaAPrestar;
            //Pregunto si el titulo de la pelicula coincide con el titulo que me pasan por parametro
            if(pelicula.getTitulo().equals(tituloPelicula)){
                //Presto el prestable
                peliculaAPrestar.prestar();
            }
        }
    }

    public void devolver(String tituloPelicula){
        //Recorro la lista de prestables
        for (Prestable peliculaADevolver:listaDePrestables) {
            //Me guardo el prestable en una pelicula y lo casteo, solamente para poder comparar su atributo titulo
            Pelicula pelicula = (Pelicula) peliculaADevolver;
            //Pregunto si el titulo de la pelicula coincide con el titulo que me pasan por parametro
            if (pelicula.getTitulo().equals(tituloPelicula)){
                //Devuelvo el prestable
                peliculaADevolver.devolver();
            }
        }
    }

    public Boolean prestado (String tituloPelicula){
        //Creo una variable donde guardar el valor del boolean prestado
        Boolean prestado = false;
        //Recorro la lista de prestables
        for (Prestable peliculaAChequear:listaDePrestables) {
            //Me guardo el prestable en una pelicula y lo casteo, solamente para poder comparar su atributo titulo
            Pelicula pelicula = (Pelicula) peliculaAChequear;
            //Pregunto si el titulo de la pelicula coincide con el titulo que me pasan por parametro
            if(pelicula.getTitulo().equals(tituloPelicula)) {
                //Chequeo si el prestable está prestado y lo guardo en mi variable
                prestado = peliculaAChequear.prestado();
            }
        }
        //Devuelvo la variable prestado
        return prestado;
    }

    public Boolean usado(String tituloPelicula){
        //Creo una variable donde guardar el valor del boolean usado
        Boolean usado = false;
        //Recorro la lista de usables
        for (Usable peliculaAChequear:listaDeUsables) {
            //Me guardo el usable en una pelicula y lo casteo, solamente para poder comparar su atributo titulo
            Pelicula pelicula = (Pelicula) peliculaAChequear;
            //Pregunto si el titulo de la pelicula coincide con el titulo que me pasan por parametro
            if(pelicula.getTitulo().equals(tituloPelicula)) {
                //Chequeo si el usable está siendo usado y lo guardo en mi variable
                usado = peliculaAChequear.usado();
            }
        }
        //Devuelvo la variable prestado
        return usado;
    }

}
