package archway.seedwork.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.Data;

@SpringBootApplication
@Data
public class ErrorInfo {
    public String code;
    public String description;

    public ErrorInfo(String code, String description) {
        this.code = code;
        this.description = description;
    }
}