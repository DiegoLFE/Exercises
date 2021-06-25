package Cuenta;
import Cliente.Cliente;

/**
 * Created by digitalhouse on 11/03/17.
 */
public class Cuenta {

    //ATRIBUTOS
    private Integer numeroDeCuenta;
    private Double saldo = 0.;
    private Cliente titular;

    //CONSTRUCTOR
    public Cuenta(Integer unNumeroDeCuenta, Cliente unTitular){
        numeroDeCuenta = unNumeroDeCuenta;
        titular = unTitular;
    }

    //METODOS
    public void depositoDeEfectivo(Double cantidadDeDinero){
        saldo = saldo + cantidadDeDinero;
        System.out.println("Deposito - Nuevo saldo " + saldo);
    }

    public void extraccionDeEfectivo(Double cantidadDeDinero){

        if( cantidadDeDinero > saldo){
            System.out.println("Fondos Insuficientes");
        }
        else{
            saldo = saldo - cantidadDeDinero;
            System.out.println("Extraccion - Nuevo saldo " + saldo);
        }
    }

    public Double getSaldo() {
        return saldo;
    }

    protected void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
