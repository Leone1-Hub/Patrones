
package store;
import Interfaces.Reporte;
import Interfaces.FormatoSalida;

public class ReporteVentas extends Reporte {
    public ReporteVentas(FormatoSalida formatoSalida) {
        super(formatoSalida);
    }

    @Override
    public String generarReporte() {
        String contenido = "Reporte de Ventas: ... (datos de ventas)";
        return formatoSalida.generar(contenido);
    }
}
