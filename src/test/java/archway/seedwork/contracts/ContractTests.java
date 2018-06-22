package archway.seedwork.contracts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.DecimalFormat;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ContractTests {

	// @Rule
    // public ExpectedException thrown = ExpectedException.none();

	@Test
	public void required_WithTrueCondition() {
		String message = "This condition is error";

		Contract.requires(7 > 3, message);
	}

	@Test(expected = IllegalArgumentException.class)
	public void required_WithFalseCondition() {
		String message = "This condition is error";

		Contract.requires(1 > 2, message);
	}

	@Test(expected = IllegalArgumentException.class)
	public void required_When_Required_Null_Object() {
		Product obj = null;
		String message = "Value cannot be null.";

		Contract.requiresNotNull(obj, message);
	}

	@Test
	public void required_When_Required_Not_Null_Object() {
		Product obj = new Product();
		String message = "This object can not be null";

		Contract.requiresNotNull(obj, message);
	}

	@Test
	public void required_When_Required_Empty() {
		String value = "";
		String message = "This row cannot be empty or white space!";

		try {
			Contract.requiresNotEmpty(value, message);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), message);
		}
	}

	@Test
	public void required_When_Required_NotEmpty() {
		String value = "value";
		String message = "This row can not be empty!";

		Contract.requiresNotEmpty(value, message);
	}

	@Test
	public void throw_Exception_When_Required_Empty() {
		List<String> val = null;
		String message = "Value cannnot be empty.";

		try {
			Contract.requiresNotEmpty(val, message);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), message);
		}
	}

	@Test
	public void throw_Exception_When_Required_Length_Over_Max() {
		String value = "value";
		int max = 3;
		String message = "Value can not be more than 3 characters!";

		try {
			Contract.requiresLength(value, max, message);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), message);
		}
	}

	@Test
	public void throw_Exception_When_Assert_Argument_Length_Not_True() {
		String value = "value";
		int max = 8;
		String message = "Value can not be more than 8 characters!";

		Contract.requiresLength(value, max, message);
	}

	@Test
	public void throw_Exception_When_Required_Length_True() {
		String value = "value";
		int max = 8;
		int min = 6;
		String message = "Value must be between 6 and 8 characters!";

		try {
			Contract.assertArgumentLength(value, min, max, message);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), message);
		}
	}

	@Test
	public void throw_Exception_When_Assert_Argument_Length_True() {
		String value = "value";
		int max = 8;
		int min = 3;
		String message = "Value must be between 3 and 8 characters!";

		Contract.assertArgumentLength(value, min, max, message);
	}

	class Product {
		
		public String productName;
		public DecimalFormat unitPrice;

		public String getProductName() {
			return this.productName;
		}

		@Required
		
		public void setProductName(String productName) {
			this.productName = productName;
		}

		public DecimalFormat getUnitPrice() {
			return this.unitPrice;
		}

		@Required
		public void setUnitPrice(DecimalFormat unitPrice) {
			this.unitPrice = unitPrice;
		}

	}
}
