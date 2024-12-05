
package store;

public class ArticulosConCantidad extends Articulos {
    private int cantidad;

    public ArticulosConCantidad(String nombre, double precio, int cantidad) {
        super(nombre, precio);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
