package Ventas;

/**
 * Created by digitalhouse on 21/03/17.
 */
public class Venta {
    // Atributos
    private Double montoDeLaVenta;
    private Double comisionDelVendedor;

    // Constructor
    public Venta(Double unMonto, Double unaComision){
        montoDeLaVenta = unMonto;
        comisionDelVendedor = unaComision;
    }

    // Métodos
    public Double getMontoDeLaVenta() {
        return montoDeLaVenta;
    }

    public Double getComisionDelVendedor() {
        return comisionDelVendedor;
    }
}
