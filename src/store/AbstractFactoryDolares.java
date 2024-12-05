
package store;

import Interfaces.ProcesadorDePago;
import Interfaces.AbstractFactoryPago;

public class AbstractFactoryDolares implements AbstractFactoryPago {
    
    @Override
    public ProcesadorDePago createPaymentProcessor() {
        return new ProcesadorPagoDolares();
    }
}