/**
 * Created by Nicolas Lopez F on 3/15/2017.
 */
public abstract class Heroe {
    // Atributos
    private Integer nivelExperiencia;

    // Métodos
    // Creo un getter protected para que sus hijos puedan tener acceso
    protected Integer getNivelExperiencia() {
        return nivelExperiencia;
    }

    // Creo un metodo protected para los hijos que le permita aumentar la energia
    protected void aumentarExperienciaEn(Integer aumento){
        nivelExperiencia = nivelExperiencia + aumento;
    }

    // Creo un metodo protected para los hijos que le permita disminuir la energia
    protected void disminuirExperienciaEn(Integer disminucion){

        nivelExperiencia = nivelExperiencia - disminucion;
    }

    public abstract void lucharContra(Criatura unaCriatura);
}
