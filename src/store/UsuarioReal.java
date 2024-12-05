
package store;

import Interfaces.IInventario;
import java.util.HashMap;
import java.util.Map;

public class UsuarioReal implements IInventario {
    private Map<String, Articulos> inventario;
    
    public UsuarioReal() {
        this.inventario = new HashMap<>();
    }

    public void agregarArticulo(Articulos articulo, String rolUsuario) {
        if (rolUsuario.equals("administrador")) {
            inventario.put(articulo.getNombre(), articulo);
            System.out.println("Artículo agregado: " + articulo.getNombre());
        } else {
            System.out.println("Acceso denegado. Solo los administradores pueden agregar artículos.");
        }
    }

    @Override
    public Map<String, Articulos> obtenerInventario() {
        return inventario;
    }

    @Override
    public void agregarArticulo(Articulos articulo) {
        throw new UnsupportedOperationException("Not supported yet.");
}
}