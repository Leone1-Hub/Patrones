
package store;

public class VerificadorDePagoImpl implements VerificadorDePago {
    
    @Override
    public boolean esSuficiente(double total, double recibido) {
        return recibido >= total;
    }
}
