
package store;
import Interfaces.Command;
import Interfaces.ArticlesPrototype;
import java.util.ArrayList;
import java.util.List;

public class CloneCommand {
    private ArticlesPrototype prototype;
    private List<String> messages;
    private List<ArticlesPrototype> clonedArticles;

    public CloneCommand(ArticlesPrototype prototype) {
        this.prototype = prototype;
        this.messages = new ArrayList<>();
        this.clonedArticles = new ArrayList<>();
    }

    public void execute() {
        ArticlesPrototype cloned = prototype.clone();
        clonedArticles.add(cloned);
        messages.add("Clonado: " + cloned.getNombre() + " - Precio: " + cloned.getPrecio());
    }

    public void undo() {
        if (!clonedArticles.isEmpty()) {
            ArticlesPrototype lastCloned = clonedArticles.remove(clonedArticles.size() - 1);
            messages.add("Deshecho: " + lastCloned.getNombre());
        } else {
            messages.add("No hay nada que deshacer.");
        }
    }

    public List<String> getMessages() {
        return messages;
    }
}