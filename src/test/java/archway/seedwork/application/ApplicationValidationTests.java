package archway.seedwork.application;

import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.var;


@RunWith(SpringRunner.class)
public class ApplicationValidationTests {

	@Test
	public void validations_Result_Not_empty() {
		String value = "value";
		String name = "User1";

		ValidationResult result = ApplicationValidations.notEmpty(value, name);
		Assert.assertFalse(result.succeeded);
	}
}
