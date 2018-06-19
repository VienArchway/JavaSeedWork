package archway.seedwork.application.model;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public abstract class Pagination {
    public Integer limit;
    public Integer offset;

    public Pagination() {
        this.limit = 50;   
    }
}