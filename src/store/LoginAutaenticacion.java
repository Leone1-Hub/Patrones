
package store;
import java.util.Arrays;

public class LoginAutaenticacion {
    public boolean authenticate(char[] password) {
        char[] correctPassword = "123456".toCharArray();
        return Arrays.equals(correctPassword, password);
    }
}
