
package store;

import Interfaces.CaracteristicaArticulo;

public class DescuentosMFactory implements CaracteristicaArticulo {
    
    private double porcentajeDescuento;

     public DescuentosMFactory(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
   
    @Override
    public double aplicarCaracteristica(double precio) {
        // Calcula el descuento basado en el porcentaje
        double descuento = precio * (porcentajeDescuento / 100);
        return precio - descuento;
    }

    public static CaracteristicaArticulo createDescuento(double porcentajeDescuento) {
        return new DescuentosMFactory(porcentajeDescuento);
    }
}
