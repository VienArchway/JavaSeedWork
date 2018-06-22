package archway.seedwork.infrastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import archway.seedwork.application.model.Pagination;

@SpringBootApplication
public class PaginationExtentsions {

    public static <T> List<T> Pagenate(List<T> query, Pagination page) {
        
        if(page.getOffset() == null) {
            query = query.stream().limit(page.limit.intValue()).collect(Collectors.toList());
        } else if (page.getLimit() == null) {
            query = query.stream().skip(page.offset.intValue()).collect(Collectors.toList());
        } else {
            query = query.stream().skip(page.offset.intValue()).collect(Collectors.toList());
            query = query.stream().limit(page.limit.intValue()).collect(Collectors.toList());
        }

        // query = page.hasOffSet() ? query.stream().skip(page.offset.intValue()).collect(Collectors.toList()) : query;
        // query = page.hasLimit() ? query.stream().limit(page.limit.intValue()).collect(Collectors.toList()) : query;
        
        return query;
    }
}