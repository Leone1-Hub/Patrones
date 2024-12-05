
package store;

public class Articulos extends ArticlesPrototype {
    
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

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setCaracteristica(CaracteristicaArticulo caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public double getPrecioConDescuento() {
        if (caracteristica != null) {
            return caracteristica.aplicarCaracteristica(precio);
        }
        return precio;
    }

    @Override
    public double getPrecioConDescuento(int cantidad) {
        double precioConDescuento = getPrecioConDescuento();
        return precioConDescuento * cantidad;
    }

    @Override
    public CaracteristicaArticulo getCaracteristica() {
        return caracteristica;
    }

    @Override
    public double getPrecioConIGV() {
        final double IGV = 0.18; // 18% de IGV
        return getPrecioConDescuento() * (1 + IGV);
    }
}
