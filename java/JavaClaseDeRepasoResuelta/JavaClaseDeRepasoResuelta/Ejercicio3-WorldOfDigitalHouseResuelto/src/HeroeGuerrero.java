/**
 * Created by Nicolas Lopez F on 3/15/2017.
 */
public class HeroeGuerrero extends Heroe{
    // Atributos
    private Integer vida;

    // Métodos
    public void setVida(Integer vida) {
        this.vida = vida;
    }

    // Le hago un override al metodo del padre
    @Override
    public void lucharContra(Criatura unaCriatura) {

        // Primero llamo al metodo que cree que me dice si puede pelear
        if(estaVivo()){
            if (unaCriatura.getAtaque() < getNivelExperiencia()){
                System.out.println("Criatura insulsa creias que podias contra mi");
                aumentarExperienciaEn(1);
            }
            else {
                System.out.println("La criatura mato a nuestro heroe");
                vida = 0;
            }
        }else{
            System.out.println("El guerrero no puede luchar  y deberá esperar su resurreccion");

        }
    }

    // Creo un metodo para preguntarle si puede pelear o no
    public Boolean estaVivo(){
        if (vida > 0){
            return true;
        }
        else {
            return false;
        }
    }
}
