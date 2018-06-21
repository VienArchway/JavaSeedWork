package archway.seedwork.infrastructure;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.assertj.core.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import archway.seedwork.application.model.Pagination;


@RunWith(SpringRunner.class)
public class PaginationExtentsionsTests {

	private final List<String> data;

	public List<String> getData() {
		return this.data;
	}

	public PaginationExtentsionsTests() {
		data = new ArrayList<String>();
		data.add("C#");
		data.add("Java");
		data.add("Go");
		data.add("Javascript");
		data.add("Jquery");
		data.add("Ruby");
		data.add("Python");
	}

	@Test
	public void Pagenate_With_Offset_Limit_NotNull() {
		PaginationExtentsions paginate = new PaginationExtentsions();
		Stream<String> stream = data.stream();
		Pagination page = new Pagination(5,3);

		

		assertEquals(3, paginate.Pagenate(data, page));

	}
}
