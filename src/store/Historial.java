
package store;

import java.util.ArrayList;
import java.util.List;

public class Historial {
    private final List<PrecioMemento> mementos = new ArrayList<>();

    public void agregarMemento(PrecioMemento memento) {
        mementos.add(memento);
    }

    public PrecioMemento obtenerMemento(int index) {
        if (index >= 0 && index < mementos.size()) {
            return mementos.get(index);
        }
        return null; // O lanzar una excepción
    }

    public int getCantidadMementos() {
        return mementos.size();
    }
}