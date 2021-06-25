package Cuenta;

import Cliente.Cliente;

/**
 * Created by digitalhouse on 13/03/17.
 */
public class CajaDeAhorro extends Cuenta{

    //ATRIBUTOS
    private Double tasaDeInteres;

    //CONSTRUCTORES
    public CajaDeAhorro(Integer unNumeroDeCuenta, Cliente unTitular, Double unaTasaDeInteres) {
        super(unNumeroDeCuenta, unTitular);
        tasaDeInteres = unaTasaDeInteres;
    }

    //METODOS
    public void cobrarInteres() {
        //HAGO EL CALCULO DE CUANTO LE TENGO QUE PAGAR DE INTERES
        Double interesAPagar = getSaldo() * tasaDeInteres;

        //SE LO SUMO AL SALDO ANTERIOR
        setSaldo(getSaldo() + interesAPagar);
    }

}
