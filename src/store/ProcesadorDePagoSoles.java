
package store;


public class ProcesadorDePagoSoles implements ProcesadorDePago {
    
    @Override
    public void realizarPago(double monto) {
        System.out.println("Pago en soles: " + monto);
    }
}
