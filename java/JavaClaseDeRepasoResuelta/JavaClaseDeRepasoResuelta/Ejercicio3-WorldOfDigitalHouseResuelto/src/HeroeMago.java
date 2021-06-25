/**
 * Created by Nicolas Lopez F on 3/15/2017.
 */
public class HeroeMago extends Heroe{

    // Métodos
    // Le hago un override al metodo del padre
    @Override
    public void lucharContra(Criatura unaCriatura) {


        if (unaCriatura.getAtaque() < getNivelExperiencia()){
            System.out.println("Tus macabros ataques no son nada contra mis hechizos");
            aumentarExperienciaEn(2);
        }
        else {
            System.out.println("La criatura mato a nuestro heroe");
            disminuirExperienciaEn(1);      }
    }

    public void resuscitarGuerrero(HeroeGuerrero guerrero){
        if (!guerrero.estaVivo() && guerrero.getNivelExperiencia() < this.getNivelExperiencia()){

            guerrero.setVida(this.getNivelExperiencia());
        }
    }
}
