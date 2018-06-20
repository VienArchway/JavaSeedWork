package archway.seedwork.contracts;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

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

    public static <T> void requiresNotEmpty(List<T> val, String message) {
        if (val == null || val.indexOf(val) == -1) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void requiresLength(String val, int max, String message) {
        int length = val.trim().length();
        if (length > max) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void AssertArgumentLength(String val, int min, int max, String message) {
        int length = val.trim().length();
        if (length < min || length > max) {
            throw new IllegalArgumentException(message);
        }
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