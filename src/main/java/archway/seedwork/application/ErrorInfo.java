package archway.seedwork.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.Data;

@SpringBootApplication
@Data
public class ErrorInfo {
    public String code;
    public String description;
}