
package store;

public class EnvioBase implements Envio {
    private double precio;
    private String descripcion;

    public EnvioBase(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }
}