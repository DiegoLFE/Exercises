package Animales;

/**
 * Created by Pedro Eduardo Waquim on 17/03/17.
 */
public class Perro extends AnimalesDomesticos {
    //Atributos
    private Boolean esGuardian;

    //Constructor
    public Perro(String unNombre, Boolean esGuardian) {
        super(unNombre);
        this.esGuardian = esGuardian;
    }

    //Metodos
    public void ladrar(){
        System.out.println("Guau Guau!!!");
    }

    public void grunir(){
        System.out.println("Grrrrr!!!");
    }

    public void vigilar(){
        System.out.println("o-o");
    }

    public void moverCola(){
        System.out.println("@@@");
    }

    @Override
    public void jugar() {
        System.out.println("Hueso Hueso!!!");
        setFelicidad(getFelicidad() + 20);
    }
}
