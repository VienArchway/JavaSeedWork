package archway.seedwork.contracts;

import java.util.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Contract {

    public static void requires(boolean condition, String message) {
        if (!condition) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void requiresNotNull(Object obj, String message) {
        if (obj == null) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void requiresNotEmpty(String val, String message) {
        if (val == null || isWhitespace(val)) {
            throw new IllegalArgumentException(message); 
        }
    }

    public static <T> void requiresNotEmpty(Collection<T> val, String message) {
        
    }

    private static boolean isWhitespace(String message) {
        int length = message.length();
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(message.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}