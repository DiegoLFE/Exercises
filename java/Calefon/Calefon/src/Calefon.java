/**
 * Created by digitalhouse on 13/03/17.
 */
public class Calefon {

    //Atributos
    private Integer capacidad;
    private Integer nivel;

    //Métodos
    public Integer llenarCalefon (Balde unBalde){

        //Guardo el agua que arroja el balde
        Integer cantidadDeAguaEnElBalde = unBalde.arrojarAgua();

        //Guardo el calculo de cuanto le falta para llenarse
        Integer cuantoLeFalta = capacidad - nivel;

        //Guardo la cantidad de agua que va a cargar el calefon
        Integer cuantoCarga = Math.min(cantidadDeAguaEnElBalde, cuantoLeFalta);

        //Cargo el calefón
        nivel = nivel + cuantoCarga;

        //Devuelvo la cantidad de agua que se cargó
        return cuantoCarga;
    }

    //Setea la capacidad de agua que va a poder cargar el calefon
    public void setCapacidad(Integer capacidadCalefon) {
        capacidad = capacidadCalefon;
    }

    //Setea la cantidad de agua que tiene el calefón
    public void setNivel(Integer nivelDeAgua) {
        nivel = nivelDeAgua;
    }
}
