
package store;

public class AbstractFactoryDolares implements AbstractFactoryPago {
    
    @Override
    public ProcesadorDePago createPaymentProcessor() {
        return new ProcesadorPagoDolares();
    }
}