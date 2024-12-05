
package store;

public class AbstractFactorySoles implements AbstractFactoryPago {
    
    @Override
    public ProcesadorDePago createPaymentProcessor() {
        return new ProcesadorPagoSoles();
    }
}
