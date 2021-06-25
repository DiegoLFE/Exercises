package Animales;

/**
 * Created by Pedro Eduardo Waquim on 17/03/17.
 */
public class Gato extends AnimalesDomesticos {
    //Atributos

    //Constructor
    public Gato(String unNombre) {
        super(unNombre);
    }

    //Metodos
    public void maullar(){
        System.out.println("Miauu!!!");
    }

    public void ronronear(){
        System.out.println("aarrr!!!");
    }

    @Override
    public void jugar() {
        System.out.println("Hilo Hilo!!!");
        setFelicidad(getFelicidad() + 10);
    }
}
