
package store;

import Interfaces.CaracteristicaArticulo;
import Interfaces.ArticlesPrototype;

public class Articulos extends ArticlesPrototype {
    private String nombre;
    private double precio;
    private Historial historial;

    public Articulos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.historial = new Historial(); 
        historial.agregarMemento(crearMemento()); // Guardar el precio inicial en el historial
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    public void setPrecio(double precio) {
        // Guardar el precio anterior en el historial antes de cambiarlo
        historial.agregarMemento(crearMemento());
        this.precio = precio;
    }

    public PrecioMemento crearMemento() {
        return new PrecioMemento(precio);
    }

    public void restaurarDesdeMemento(int index) {
        PrecioMemento memento = historial.obtenerMemento(index);
        if (memento != null) {
            this.precio = memento.getPrecio();
        } else {
            System.out.println("Memento no encontrado.");
        }
    }

    @Override
    public void setCaracteristica(CaracteristicaArticulo caracteristica) {
        // Implementar si es necesario
    }

    @Override
    public double getPrecioConDescuento() {
        return precio * 0.9; // Ejemplo: 10% de descuento
    }

    @Override
    public double getPrecioConDescuento(int cantidad) {
        return getPrecioConDescuento() * cantidad;
    }

    @Override
    public CaracteristicaArticulo getCaracteristica() {
        return null; // Implementar si es necesario
    }

    @Override
    public double getPrecioConIGV() {
        return precio * 1.18; // Ejemplo: 18% de IGV
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " - Precio: " + precio;
    }
}