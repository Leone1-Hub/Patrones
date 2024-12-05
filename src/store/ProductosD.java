
package store;

import java.util.ArrayList;
import java.util.List;

public class ProductosD extends Articulos {
    
    private Descuentos descuento;

    public ProductosD(String nombre, double precio, double porcentajeDescuento) {
        super(nombre, precio);
        this.descuento = new Descuentos(porcentajeDescuento);
        setCaracteristica(descuento); // Establece la característica en el artículo base
    }

    @Override
    public double getPrecioConIGV() {
        double precioBase = getPrecioConDescuento(); // Aplica el descuento si está definido
        return precioBase * 1.18; // Calcula el precio con IGV
    }
}
