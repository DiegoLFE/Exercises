import Animales.Gato;
import Animales.Perro;

public class Main {

    public static void main(String[] args) {
        Perro perro = new Perro("El enviado de Santa",true);
        Gato gato = new Gato("Bola de nieve");

        System.out.println("Nombre: "+ perro.getNombre());
        perro.ladrar();
        perro.grunir();
        perro.moverCola();
        perro.vigilar();
        perro.jugar();
        perro.comer(20);
        perro.dormir();
        System.out.println("Energia: " + perro.getEnergia());
        System.out.println("Felicidad: " + perro.getFelicidad());

        System.out.println("\n\n\n");

        System.out.println("Nombre: "+ gato.getNombre());
        gato.maullar();
        gato.ronronear();
        gato.jugar();
        gato.comer(20);
        gato.dormir();
        System.out.println("Energia: " + gato.getEnergia());
        System.out.println("Felicidad: " + gato.getFelicidad());
    }
}
