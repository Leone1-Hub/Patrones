
package store;

public class Producto implements IProducto {
    private String descripcion;
    private double precio;
    private int cantidad;  

    public Producto(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = 1;  // Inicializamos la cantidad en 1
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;  // Método para obtener la cantidad
    }
    
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}