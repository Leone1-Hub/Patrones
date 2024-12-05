
package store;

import Interfaces.IProducto;
import java.util.ArrayList;
import java.util.List;

public class ComboProducto implements IProducto {
    private String descripcion;
    private List<Producto> productos = new ArrayList<>();  

    public ComboProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void removerProducto(Producto producto) {
        productos.remove(producto);
    }

    public void actualizarCantidad(int indice, int cantidad) {
        if (indice >= 0 && indice < productos.size()) {
            productos.get(indice).setCantidad(cantidad);
        }
    }

    @Override
    public String getDescripcion() {
        StringBuilder descripcionCompleta = new StringBuilder(descripcion + " contiene: \n");
        for (Producto producto : productos) {
            descripcionCompleta.append("- ").append(producto.getDescripcion()).append(" (Cantidad: ").append(producto.getCantidad()).append(")\n");
        }
        return descripcionCompleta.toString();
    }

    @Override
    public double getPrecio() {
        double precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio() * producto.getCantidad();  // Multiplicamos por la cantidad
        }
        return precioTotal;
    }
}