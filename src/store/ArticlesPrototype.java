
package store;

public abstract class ArticlesPrototype implements Cloneable {
    private String nombre;
    private double precio;
    private CaracteristicaArticulo caracteristica;

    public abstract void setNombre(String nombre);
    public abstract double getPrecio();
    public abstract void setCaracteristica(CaracteristicaArticulo caracteristica);
    public abstract double getPrecioConDescuento();
    public abstract double getPrecioConDescuento(int cantidad);
    public abstract CaracteristicaArticulo getCaracteristica();
    public abstract double getPrecioConIGV();

    public ArticlesPrototype clone() {
        try {
            return (ArticlesPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
