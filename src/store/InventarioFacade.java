
package store;
import java.util.Map;

public class InventarioFacade {
    private InventarioMemoryFacade inventarioMemoria;

    public InventarioFacade(InventarioMemoryFacade inventarioMemoria) {
        this.inventarioMemoria = inventarioMemoria;
    }

    public void agregarArticulo(Articulos articulo) {
        inventarioMemoria.agregarArticulo(articulo);
    }

    public Map<String, Articulos> obtenerInventario() {
        return inventarioMemoria.getInventario();
    }

}