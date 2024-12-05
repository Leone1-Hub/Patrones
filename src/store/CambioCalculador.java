
package store;
import java.text.DecimalFormat;

public class CambioCalculador implements CalculadoraCambio, VerificadorDePago {
    
    private static CambioCalculador instance;
    private final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public static CambioCalculador getInstance() {
        if (instance == null) {
            instance = new CambioCalculador();
        }
        return instance;
    }
     
    @Override
    public double calcularCambio(double total, double recibido) {
        if (recibido < total) {
            return -(total - recibido); // Devuelve la resta como un valor negativo
        } else {
            double cambio = recibido - total;
            return cambio;
        }
    }
    
    @Override
    public boolean esSuficiente(double total, double recibido) {
        return new VerificadorDePagoImpl().esSuficiente(total, recibido);
    }
    }










