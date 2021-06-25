package Empleados;

import Ventas.Venta;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 21/03/17.
 */
public class EmpleadoComision extends Empleado {
    // Atributos
    private ArrayList<Venta> registroDeVentas = new ArrayList<>();

    // Constructor
    public EmpleadoComision(Double unSueldoBasico) {
        super(unSueldoBasico);
    }

    // Métodos
    public void registrarVenta(Venta unaVenta){
        registroDeVentas.add(unaVenta);
    }

    @Override
    public Double getSueldo() {
        Double totalComisiones = 0.;

        for (Integer i = 0; i < registroDeVentas.size(); i++){
            Venta unaVenta = registroDeVentas.get(i);
            totalComisiones += unaVenta.getComisionDelVendedor();
        }

        return super.getSueldo() + totalComisiones;
    }
}
