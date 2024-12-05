
package store;
import javax.swing.JTextArea;

public class ModuloEnvio implements Observador {
    private JTextArea areaTexto;

    public ModuloEnvio(JTextArea areaTexto) {
        this.areaTexto = areaTexto;
    }

    @Override
    public void actualizar(String estado) {
        areaTexto.append("ModuloEnvio: El estado del pedido ha cambiado a '" + estado + ".\n");
    }
}