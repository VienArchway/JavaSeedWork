package archway.seedwork.infrastructure;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
public class PaginationExtentsions {

    public PageRequest gotoPage (int page, int size) {
        PageRequest request = new PageRequest(page, size);
        return request;
    }
}