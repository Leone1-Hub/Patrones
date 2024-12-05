
package store;

public class Descuentos implements CaracteristicaArticulo {
    
    private double porcentajeDescuento;

    // Constructor que acepta un porcentaje de descuento (por ejemplo, 6 para un 6%)
     public Descuentos(double porcentajeDescuento) {
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
}
