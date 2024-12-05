
package store;
import Interfaces.Estado;

public class Repuesto implements Estado {
    public String getMensaje() {
        return "Se ha repuesto el producto";
    }

    @Override
    public void gestionarDisponibilidad(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
