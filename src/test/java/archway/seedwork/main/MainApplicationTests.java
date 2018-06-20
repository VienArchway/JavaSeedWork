package archway.seedwork.main;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MainApplicationTests {

	@Test
	public void myFirstTests() {
		int a = 1;
        int b = 1;
		int c = a + b;
		Assert.assertEquals(2, c);
	}

}
