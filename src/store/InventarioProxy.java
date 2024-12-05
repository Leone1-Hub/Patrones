
package store;

import Interfaces.IInventario;
import java.util.Map;

public class InventarioProxy implements IInventario {
    private InventarioMemoryFacade inventarioReal;
    private String rolUsuario;

    public InventarioProxy(InventarioMemoryFacade inventarioReal, String rolUsuario) {
        this.inventarioReal = inventarioReal;
        this.rolUsuario = rolUsuario;
    }

    @Override
    public void agregarArticulo(Articulos articulo) {
        if (rolUsuario.equals("administrador")) {
            inventarioReal.agregarArticulo(articulo);
        } else {
            System.out.println("Acceso denegado. Solo los administradores pueden agregar artículos.");
        }
    }
    
    public String getRolUsuario() {
        return rolUsuario;
    }

    @Override
    public Map<String, Articulos> obtenerInventario() {
        return inventarioReal.obtenerInventario();
    }
}
