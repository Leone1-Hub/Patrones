
package store;
import Interfaces.FormatoSalida;

public class PDFSalida implements FormatoSalida {
    @Override
    public String generar(String contenido) {
        return "Generando PDF con el contenido:\n" + contenido;
    }
}
