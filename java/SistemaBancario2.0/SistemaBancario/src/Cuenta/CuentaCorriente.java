package Cuenta;

import Cliente.Cliente;

/**
 * Created by digitalhouse on 13/03/17.
 */
public class CuentaCorriente extends Cuenta{

    //ATRIBUTOS
    private Double limiteGiroEnDescubierto;

    public CuentaCorriente(Integer unNumeroDeCuenta, Cliente unTitular, Double unLimiteGiroEnDescubierto) {
        super(unNumeroDeCuenta, unTitular);
        limiteGiroEnDescubierto = unLimiteGiroEnDescubierto;
    }

    //METODOS
    @Override
    public void extraccionDeEfectivo(Double cantidadDeDinero) {

        if( cantidadDeDinero > getSaldo() + limiteGiroEnDescubierto){
            System.out.println("Fondos insuficientes");
        }
        else{
            setSaldo(getSaldo() - cantidadDeDinero);
        }
    }

    public void depositarCheque(Cheque unCheque){
        //SUMO EL VALOR DEL CHEQUE AL SALDO DE LA CUENTA

        //OPCION 1
        //setSaldo( getSaldo() + unCheque.getMonto());

        //OPCION2
        super.depositoDeEfectivo(unCheque.getMonto());
    }
}
