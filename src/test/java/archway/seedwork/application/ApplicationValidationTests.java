package archway.seedwork.application;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ApplicationValidationTests {

	@Test
	public void validations_Result_Not_empty() {
		
		String value = "value";
		String name = "User1";

		ValidationResult result = ApplicationValidations.notEmpty(value, name);
		
		Assert.assertTrue(result.succeeded);
	}

	@Test
	public void validations_Result_empty_or_Value() {
		String value = "";
		String name = "userTest";

		ValidationResult result = ApplicationValidations.notEmpty(value, name);

		Assert.assertFalse(result.succeeded);
		Assert.assertEquals("usertestempty", result.error.code);
		Assert.assertEquals("userTest must not be empty!", result.error.description);
	}

	@Test
	public void validations_Result_Null_Value() {
		String value = null;
		String name = "userTest";

		ValidationResult result = ApplicationValidations.notEmpty(value, name);

		Assert.assertFalse(result.succeeded);
		Assert.assertEquals("usertestempty", result.error.code);
		Assert.assertEquals("userTest must not be empty!", result.error.description);
	}

	@Test
	public void validations_Result_Found_Object() {
		
		String value = "value";
		String name = "User1";

		ValidationResult result = ApplicationValidations.notFound(value, name);
		
		Assert.assertTrue(result.succeeded);
	}

	@Test
	public void validations_Result_Not_Found_Object_with_Null_value() {
		String value = null;
		String name = "userTest";

		ValidationResult result = ApplicationValidations.notFound(value, name);

		Assert.assertFalse(result.succeeded);
		Assert.assertEquals("usertestempty", result.error.code);
		Assert.assertEquals("userTest not found!", result.error.description);
	}

	@Test
	public void validations_Result_Found_Object_with__value() {
		String value = "";
		String name = "userTest";

		ValidationResult result = ApplicationValidations.notFound(value, name);

		Assert.assertTrue(result.succeeded);
	}
}
