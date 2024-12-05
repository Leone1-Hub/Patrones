
package store;
import Interfaces.Estado;

public class BajaCantidad implements Estado {
    public String getMensaje() {
        return "Baja cantidad";
    }

    @Override
    public void gestionarDisponibilidad(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
