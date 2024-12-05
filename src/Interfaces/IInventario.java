

package Interfaces;
import java.util.Map;
import store.Articulos;

public interface IInventario {
    void agregarArticulo(Articulos articulo);
    Map<String, Articulos> obtenerInventario();
}