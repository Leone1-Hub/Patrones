
package store;

public class DescuentosMFactory implements CaracteristicaArticulo {
    
    private double porcentajeDescuento;

    // Constructor que acepta un porcentaje de descuento (por ejemplo, 6 para un 6%)
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
