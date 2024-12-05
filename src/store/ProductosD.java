
package store;

import java.util.ArrayList;
import java.util.List;

public class ProductosD extends Articulos {
    
    private static ProductosD instance;
    private DescuentosMFactory descuento;

    private ProductosD(String nombre, double precio, double porcentajeDescuento) {
        super(nombre, precio);
        this.descuento = new DescuentosMFactory(porcentajeDescuento);
        setCaracteristica(descuento); 
    }

    public static ProductosD getInstance(String nombre, double precio, double porcentajeDescuento) {
        if (instance == null) {
            instance = new ProductosD(nombre, precio, porcentajeDescuento);
        }
        return instance;
    }

    @Override
    public double getPrecioConIGV() {
        double precioBase = getPrecioConDescuento(); // Aplica el descuento si está definido
        return precioBase * 1.18; // Calcula el precio con IGV
    }
}
