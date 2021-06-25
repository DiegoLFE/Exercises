import java.util.*;

/**
 * Created by digitalhouse on 30/03/17.
 */
public class Biblioteca {
    private List<Publicacion> listaDePublicaciones;
    private List<Prestamo> listaDePrestamos;
    private List<Socio> listaDeSocios;
    private Map<Categoria,List<Publicacion>> publicacionPorCategoria;

    public Biblioteca() {
        this.listaDePublicaciones = new ArrayList<>();
        this.listaDePrestamos = new ArrayList<>();
        this.listaDeSocios = new ArrayList<>();
        this.publicacionPorCategoria = new HashMap<>();
    }

    public void agregarSocio(Socio unSocio){
        listaDeSocios.add(unSocio);
        System.out.println("Se agregó al socio " + unSocio.getNombre());
    }

    public void agregarPublicacion(Publicacion publicacion){
        listaDePublicaciones.add(publicacion);
        System.out.println("Se agregó una publicacion " + publicacion.getNombre());
    }

    public void prestar(Integer codigoISBN, Integer numeroDeIdentificacion){
        Publicacion publicacion = null;
        for (Publicacion unaPublicacion:listaDePublicaciones) {
            if(unaPublicacion.getCodigoISBN().equals(codigoISBN)){
                publicacion = unaPublicacion;
                System.out.println("La publicacion " + publicacion.getNombre() + " está en la base de datos" );
                break;
            }
        }
        Socio socioGuardado = null;
        for (Socio socio :listaDeSocios) {
            if(socio.getNumeroID().equals(numeroDeIdentificacion)){
                System.out.println("El socio " + socio.getNombre() + " está en la base de datos" );
                socioGuardado = socio;
            }
        }

        Ejemplar unEjemplar = null;
        if (publicacion.tieneEjemplaresDisponibles() && socioGuardado.tieneCupoDisponible()){
            unEjemplar = publicacion.prestarEjemplar();
            socioGuardado.tomarPrestadoUnEjemplar(unEjemplar);
            System.out.println("Hay ejemplares disponibles de " +publicacion.getNombre()+ " y el socio " + socioGuardado.getNombre() + " puede retirar ejemplares");
        }
        Prestamo prestamo = new Prestamo(unEjemplar, socioGuardado);
        listaDePrestamos.add(prestamo);
        System.out.println("Detalle de prestamo: " + prestamo.toString());
    }

    public void devolver(Ejemplar unEjemplar, Integer numeroDeIdentificacion){
        Ejemplar ejemplarADevolver = null;
        for (Socio socio:listaDeSocios) {
            if (socio.getNumeroID().equals(numeroDeIdentificacion)){
                ejemplarADevolver = socio.devolverUnEjemplar(unEjemplar);

            }
        }
        if (ejemplarADevolver!=null) {
            for (Publicacion publicacion : listaDePublicaciones) {
                if (unEjemplar.getPublicacion().equals(publicacion)) {
                    publicacion.reingresar(ejemplarADevolver);
                }
            }

        }
    }

    public void prestar(List<Publicacion> listaDePublicaciones, Socio unSocio){
        for (Publicacion publicacion:listaDePublicaciones) {
            prestar(publicacion.getCodigoISBN(),unSocio.getNumeroID());
        }
    }

    public void devolver(List<Ejemplar> listaDeEjemplares, Socio unSocio){
        for (Ejemplar ejemplar:listaDeEjemplares) {
            devolver(ejemplar, unSocio.getNumeroID());
        }
    }

    public void agregarPublicacionACategoria(Categoria categoria, Publicacion publicacion){
        if(publicacionPorCategoria.containsKey(categoria)){
            List<Publicacion> listaAgregar = publicacionPorCategoria.get(categoria);
            listaAgregar.add(publicacion);
            publicacionPorCategoria.put(categoria,listaAgregar);
            System.out.println("Se agregó " + publicacion.getNombre() + " a la categoria " + categoria.getNombre());
        }else{
            List<Publicacion> listaAgregar = new ArrayList<>();
            listaAgregar.add(publicacion);
            publicacionPorCategoria.put(categoria, listaAgregar);
            System.out.println("Se agregó " + publicacion.getNombre() + " a la categoria " + categoria.getNombre());
        }
    }

    public List<Publicacion> listarPublicacionesDe(Categoria categoria){
        return publicacionPorCategoria.get(categoria);
    }

    public Categoria getCategoriaDePublicacion(Publicacion publicacion){
        List<Publicacion> lista;
        Categoria unaCategoria = null;
        for (Categoria categoria:publicacionPorCategoria.keySet()) {
            lista = publicacionPorCategoria.get(categoria);
            if (lista.contains(publicacion)){
                unaCategoria = categoria;
            }
        }
        return unaCategoria;
    }

    public void imprimirNuevosEjemplares (List<Imprimible> imprimibles){
        for (Imprimible imprimible:imprimibles) {
            imprimible.imprimir();
        }
    }
}
