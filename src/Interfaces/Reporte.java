
package Interfaces;
import Interfaces.FormatoSalida;

public abstract class Reporte {
    protected FormatoSalida formatoSalida;

    public Reporte(FormatoSalida formatoSalida) {
        this.formatoSalida = formatoSalida;
    }

    public abstract String generarReporte();
}
