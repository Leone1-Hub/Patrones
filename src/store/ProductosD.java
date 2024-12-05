
package store;
import Interfaces.Estado;

public class ProductosD extends Articulos {

    private DescuentosMFactory descuento;
    private Producto producto; // Referencia al objeto Producto
    private Estado estado; // Estado de disponibilidad

    public ProductosD(String nombre, double precio, double porcentajeDescuento, int cantidadInicial) {
        super(nombre, precio);
        this.descuento = new DescuentosMFactory(porcentajeDescuento);
        setCaracteristica(descuento);
        this.producto = new Producto(nombre, precio);
        this.producto.setCantidad(cantidadInicial);
        actualizarEstado(); // Inicializar el estado
    }

    @Override
    public double getPrecioConIGV() {
        double precioBase = getPrecioConDescuento();
        return precioBase * 1.18; // Calcula el precio con IGV
    }

    public void ajustarInventario(int cantidad) {
        int nuevaCantidad = producto.getCantidad() + cantidad;
        producto.setCantidad(nuevaCantidad);
        actualizarEstado(); // Actualizar el estado después de ajustar la cantidad
    }

    private void actualizarEstado() {
        if (producto.getCantidad() <= 0) {
            estado = new Agotado();
        } else if (producto.getCantidad() < 11) {
            estado = new BajoInventario(); // "Se necesita reponer pronto"
        } else if (producto.getCantidad() < 15) {
            estado = new BajaCantidad(); // "Baja cantidad"
        } else if (producto.getCantidad() >= 30) {
            estado = new Repuesto(); // "Se ha repuesto el producto"
        } else {
            estado = new Disponible(); // "Disponible"
        }
    }

    public String getEstadoDisponibilidad() {
        return estado.getClass().getSimpleName(); // Retorna el nombre de la clase del estado actual
    }

    public int getCantidad() {
        return producto.getCantidad();
    }
}