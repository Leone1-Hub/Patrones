
package store;

public abstract class EnvioDecorator implements Envio {
    protected Envio envioDecorado;

    public EnvioDecorator(Envio envioDecorado) {
        this.envioDecorado = envioDecorado;
    }

    @Override
    public double getPrecio() {
        return envioDecorado.getPrecio();
    }

    @Override
    public String getDescripcion() {
        return envioDecorado.getDescripcion();
    }
}
