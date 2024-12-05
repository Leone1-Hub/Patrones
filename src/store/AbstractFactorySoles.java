
package store;

import Interfaces.ProcesadorDePago;
import Interfaces.AbstractFactoryPago;

public class AbstractFactorySoles implements AbstractFactoryPago {
    
    @Override
    public ProcesadorDePago createPaymentProcessor() {
        return new ProcesadorPagoSoles();
    }
}
