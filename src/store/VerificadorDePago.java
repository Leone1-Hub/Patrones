
    package store;

    public interface VerificadorDePago {
        
        boolean esSuficiente(double total, double recibido);
    }