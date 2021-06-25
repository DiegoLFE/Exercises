package Animales;

/**
 * Created by digitalhouse on 17/03/17.
 */
public abstract class AnimalesDomesticos {
    //Atributos
    private String nombre;
    private Integer energia = 100;
    private Integer felicidad = 100;

    //Constructor
    public AnimalesDomesticos(String unNombre){
        this.nombre = unNombre;
    }

    //Setters
    protected void setFelicidad(Integer nivelFelicidad){
        this.felicidad = nivelFelicidad;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public Integer getFelicidad() {
        return felicidad;
    }

    public Integer getEnergia() {
        return energia;
    }

    //Métodos
    public void comer(Integer unaComida){
        System.out.println("Mmm, que rico!");
        energia += unaComida;
    }

    public void dormir(){
        System.out.println("Zzz");
        energia += 10;
    }

    public abstract void jugar();
}
