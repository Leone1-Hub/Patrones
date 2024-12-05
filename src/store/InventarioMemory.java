
package store;

import Interfaces.IInventario;
import java.util.HashMap;
import java.util.Map;

public class InventarioMemory implements IInventario{
    private Map<String, Articulos> inventario;

    public InventarioMemory() { // constructor
        this.inventario = new HashMap<>();
    }
    
    // Método para agregar productos al inventario
     public void agregarProducto(String codigo, String nombre, double precio) {
        Articulos articulo = new Articulos(nombre, precio);
        this.inventario.put(codigo, articulo);
    }

    // Método para actualizar el stock de un producto después de una venta
    public void actualizarStock(String id, int cantidadVendida) {
        Articulos articulo = inventario.get(id);
        if (articulo != null) {
        } else {
        }
    }

    // Método para verificar stock disponible
    public boolean verificarStock(String id) {
        Articulos articulo = inventario.get(id);
        return articulo != null;
    }

    // Método para listar todos los productos
    public void listarInventario() {
        System.out.println("Inventario actual:");
        for (Articulos articulo : inventario.values()) {
            System.out.println(articulo.getNombre());
        }
    }
    
    public void agregarArticulo(Articulos articulo) {
        this.inventario.put(articulo.getNombre(), articulo);
    }
    
     public Map<String, Articulos> getInventario() {
        return this.inventario;
    }

    @Override
    public Map<String, Articulos> obtenerInventario() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
   
}