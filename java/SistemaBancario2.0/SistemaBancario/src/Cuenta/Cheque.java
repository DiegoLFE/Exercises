package Cuenta;

import java.util.Date;

/**
 * Created by digitalhouse on 13/03/17.
 */
public class Cheque {


    //ATRIBUTOS
    private Date fecha;
    private Double monto;
    private String bancoEmisor;

    public Date getFecha() {
        return fecha;
    }

    public Double getMonto() {
        return monto;
    }

    public String getBancoEmisor() {
        return bancoEmisor;
    }
}
