
package store;

public class EnvioUrgenteDecorator extends EnvioDecorator {
    public EnvioUrgenteDecorator(Envio envioDecorado) {
        super(envioDecorado);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 15.00; // Costo adicional de envío urgente
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " con envío urgente";
    }
}
