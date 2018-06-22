package archway.seedwork.application.model;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class Pagination {
    public Integer limit;
    public Integer offset;

    public boolean hasLimit() {
        return limit > 0;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public boolean hasOffSet() {
        return offset > 0;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Pagination(Integer offset, Integer limit) {
        this.limit = limit;
        this.offset = offset;
    }
}