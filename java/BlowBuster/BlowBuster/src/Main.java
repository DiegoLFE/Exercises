import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Instancio una lista de prestables y la inicializo
        List<Prestable> listaDePrestables = new ArrayList<>();

        //Instancio una lista de usables y la inicializo
        List<Usable> listaDeUsables = new ArrayList<>();

        //Instancio un videoclub
        VideoClub unVideoClub = new VideoClub(listaDePrestables, listaDeUsables);

        //Instancio 3 peliculas, dos del tipo Dvd y una BluRay
        Dvd peliculaDvd1 = new Dvd("IMDB8498", "Casablanca", 1950, "Español, Italiano", 3, false);
        Dvd peliculaDvd2 = new Dvd("IMDB6374", "La Bella y la Bestia", 2017, "Español, Ingles, Italiano", 4, false);
        BluRay peliculaBluray1 = new BluRay("IMDB9224", "El Resplandor", 1975, "Español, Ingles, Aleman", false);

        //Agrego las peliculas a la lista de peliculas del videoclub
        unVideoClub.agregarPrestable(peliculaDvd1);
        unVideoClub.agregarPrestable(peliculaDvd2);
        unVideoClub.agregarPrestable(peliculaBluray1);

        //Presto una de las peliculas
        unVideoClub.prestar(peliculaDvd2.getTitulo());

        //Imprimo la lista de prestables
        System.out.println(unVideoClub.listaDePrestables.toString());

        //Chequeo si la pelicula que preste está prestada
        System.out.println("La pelicula está prestada: " + unVideoClub.prestado(peliculaDvd2.getTitulo()));

        //Devuelvo la pelicula
        unVideoClub.devolver(peliculaDvd2.getTitulo());

        //Imprimo la lista de prestables
        System.out.println(unVideoClub.listaDePrestables.toString());

        //Chequeo si la pelicula que devolví está prestada
        System.out.println("La pelicula está prestada: " + unVideoClub.prestado(peliculaDvd2.getTitulo()));

        //Instancio dos peliculas Vhs, a una de ellas le digo que está siendo usada
        Vhs peliculaVhs1 = new Vhs("IMDB8498", "Casablanca", 1950, "Español", "18/10/1987", true);
        Vhs peliculaVhs2 = new Vhs("IMDB9224", "El Resplandor", 1975, "Español", "18/10/1987", false);

        //Agrego las peliculas a la lista de usables del videoclub
        unVideoClub.agregarUsable(peliculaVhs1);
        unVideoClub.agregarUsable(peliculaVhs2);

        //Imprimo por pantalla: chequeo si la pelicula está siendo usada
        System.out.println("La pelicula está siendo usada: " + unVideoClub.usado(peliculaVhs1.getTitulo()));

    }
}
