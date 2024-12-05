
package store;
import java.util.Arrays;

public class LoginAutentication {
    private static LoginAutentication instance;
    private char[] correctPassword = "ADMINITRADOR_EL_MEJOR".toCharArray();

    private LoginAutentication() {}

    public static LoginAutentication getInstance() {
        if (instance == null) {
            instance = new LoginAutentication();
        }
        return instance;
    }
    public boolean authenticate(char[] password) {
        return Arrays.equals(correctPassword, password);
    }
}