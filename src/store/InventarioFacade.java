
package store;
import java.util.Map;

public class InventarioFacade {
    private InventarioMemory inventarioMemoria;

    public InventarioFacade(InventarioMemory inventarioMemoria) {
        this.inventarioMemoria = inventarioMemoria;
    }

    public void agregarArticulo(Articulos articulo) {
        inventarioMemoria.agregarArticulo(articulo);
    }

    public Map<String, Articulos> obtenerInventario() {
        return inventarioMemoria.getInventario();
    }

}