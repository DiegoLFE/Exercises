import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Autor autor = new Autor("Gabriel Garcia Marquez");
        Autor autor1 = new Autor("Manuel Puig");
        Autor autor2 = new Autor("Carlos Martinez");

        List<Autor> listaDeAutores = new ArrayList<>();
        listaDeAutores.add(autor);
        listaDeAutores.add(autor1);

        Publicacion publicacion = new Libro("Libro 1",890, "20/3/2015", autor);
        Publicacion publicacion1 = new Libro("Libro 2",130, "15/8/1980", autor1);
        Publicacion publicacion2 = new Paper("Paper 1",290,"10/5/1958", listaDeAutores,"Este paper es sobre economía");
        Publicacion publicacion3 = new Revista("National Geographic", 780,"17/10/1933", autor2);

        biblioteca.agregarPublicacion(publicacion);
        biblioteca.agregarPublicacion(publicacion1);
        biblioteca.agregarPublicacion(publicacion2);
        biblioteca.agregarPublicacion(publicacion3);

        Socio socioComun = new SocioClasico("Pedro", "Waquim", 78234);
        Socio socioVip = new SocioVip("Luis","Diaz", 78932, 524.00);

        biblioteca.agregarSocio(socioComun);
        biblioteca.agregarSocio(socioVip);

        Ejemplar ejemplar = new Ejemplar(publicacion,1202,"2E");
        Ejemplar ejemplar1 = new Ejemplar(publicacion,1203, "2E");

        publicacion.agregarEjemplar(ejemplar);
        publicacion.agregarEjemplar(ejemplar1);

        biblioteca.prestar(890,78234);

        biblioteca.devolver(ejemplar,78234);

        Categoria categoria = new Categoria("Novela", "3", "Novelas argentinas");
        biblioteca.agregarPublicacionACategoria(categoria,publicacion);

        System.out.println("La categoria tiene las siguientes publicaciones: " + biblioteca.listarPublicacionesDe(categoria));

        System.out.println("La publicacion está en la categoria: " + biblioteca.getCategoriaDePublicacion(publicacion));

        List<Imprimible> imprimibles = new ArrayList<>();
        imprimibles.add((Imprimible) publicacion);
        imprimibles.add((Imprimible) publicacion2);

        System.out.println("Impresiones:");
        biblioteca.imprimirNuevosEjemplares(imprimibles);
    }
}
