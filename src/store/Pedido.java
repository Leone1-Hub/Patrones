
package store;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pedido {
    private String estado;
    private List<Observador> observadores;

    public Pedido() {
        this.estado = "Pendiente"; // Estado inicial
        this.observadores = new ArrayList<>();
    }

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(estado);
        }
    }

    public void cambiarEstadoAleatorio() {
        // Cambiar el estado de manera aleatoria entre "Pendiente" y "Enviado"
        Random random = new Random();
        this.estado = random.nextBoolean() ? "Enviado" : "Pendiente";
        notificarObservadores();
    }

    public String getEstado() {
        return estado;
    }
}