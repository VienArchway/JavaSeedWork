package archway.seedwork.application.model;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class Pagination {
    public int limit;
    public int offset;

    public boolean hasLimit() {
        return limit > 0;
    }

    public boolean hasOffSet() {
        return offset > 0;
    }

    public Pagination(int offset, int limit) {
        this.limit = 50;
        this.offset = offset;
    }
}