
package store;

public class Articulos {
    private String nombre;
    private double precio;
    private CaracteristicaArticulo caracteristica;

    public Articulos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCaracteristica(CaracteristicaArticulo caracteristica) {
        this.caracteristica = caracteristica;
    }

    public double getPrecioConDescuento() {
        if (caracteristica != null) {
            return caracteristica.aplicarCaracteristica(precio);
        }
        return precio;
    }

    public double getPrecioConDescuento(int cantidad) {
        double precioConDescuento = getPrecioConDescuento();
        return precioConDescuento * cantidad;
    }

     public CaracteristicaArticulo getCaracteristica() {
        return caracteristica;
    }

    // Método para obtener el precio con IGV
    public double getPrecioConIGV() {
        final double IGV = 0.18; // 18% de IGV
        return getPrecioConDescuento() * (1 + IGV);
    }
}
