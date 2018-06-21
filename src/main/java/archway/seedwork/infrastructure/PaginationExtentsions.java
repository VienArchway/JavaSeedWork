package archway.seedwork.infrastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import archway.seedwork.application.model.Pagination;

@SpringBootApplication
public class PaginationExtentsions {

    public List<String> Pagenate(List<String> query, Pagination page) {
        query = new ArrayList<>();

        query = page.hasOffSet() ? query.stream().skip(page.offset).collect(Collectors.toList()) : query;
        query = page.hasLimit() ? query.stream().limit(page.limit).collect(Collectors.toList()) : query;
        
        return query;
    }
}