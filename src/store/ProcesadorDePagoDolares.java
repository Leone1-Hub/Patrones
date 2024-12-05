
package store;

public class ProcesadorDePagoDolares implements ProcesadorDePago {
    
    @Override
    public void realizarPago(double monto) {
        System.out.println("Pago en dólares: " + monto);
    }
}