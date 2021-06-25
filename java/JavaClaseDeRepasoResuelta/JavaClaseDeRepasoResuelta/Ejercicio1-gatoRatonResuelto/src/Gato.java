import java.util.List;

/**
 * Created by Nicolas Lopez F on 3/15/2017.
 */
public class Gato  {

    // Atributos
    private String nombre;
    private Double velocidad = 5.0;
    private Double energia = 0.0;

    // getters y setters
    public String getNombre() {
        return nombre;
    }
    public Double getVelocidad() {
        return velocidad;
    }
    public Double getEnergia() {
        return energia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }
    public void setEnergia(Double energia) {
        this.energia = energia;
    }


    // Metodos
    public void comerRaton(Raton unRaton) {

        // La energia del gato incrementa igual que el peso del raton
        energia = energia + unRaton.getPeso();

    }
    public void comerRaton(List<Raton> ratones){

        //Recorro la lista de ratones que me pasaron por parametro
        for (Integer i = 0; i < ratones.size();i++ ){

            // Utilizo el metodo que creamos arriba para indicarle que se come al raton de esa posicion
            Raton ratonQueMeComo = ratones.get(i);
            comerRaton(ratonQueMeComo);
        }
    }
    public Double correr(Integer cantidadMetros){

        // Disminuye la energia en 0.5 por la cantidad de metros que corrio
        energia = energia - (0.5 * cantidadMetros);

        // Calculo cuanto tiempo tardaria en recorrer esa distancia
        Double tiempoCorriendo = cantidadMetros/velocidad;

        // Devuelvo ese tiempo
        return tiempoCorriendo;

    }


    public Boolean meConvieneComerA(Raton unRaton, Integer unaDistancia){

        // Calculo la energia que me consumiria correr a ese raton
        Double energiaConsumida = 0.5 * unaDistancia;

        // Se que la energia que gano por comermelo es su peso y asumo que no se va a mover
        if (unRaton.getPeso() > energiaConsumida){
            return true;
        }else {
            return false;
        }

    }

}
