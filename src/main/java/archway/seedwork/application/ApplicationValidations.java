package archway.seedwork.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationValidations {

	public static ValidationResult notEmpty(String val, String name) {
		if (val == null || val.isEmpty() || isWhitespace(val)) {
			return ValidationResult.failure(new ErrorInfo(name.toLowerCase().trim() + "empty", name + " must not be empty!"));
		}

		return ValidationResult.success;
	}

	public static ValidationResult notFound(Object o, String name) {
		if (o == null) {
			return ValidationResult.failure(new ErrorInfo(name.toLowerCase().trim() + "empty", name + " not found!"));
		}

		return ValidationResult.success;
	}

	private static boolean isWhitespace(String message) {
		int length = message.length();
		if (length > 0) {
			for (int i = 0; i < length; i++) {
				if (!Character.isWhitespace(message.charAt(i))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}

class ValidationResult {
	public boolean succeeded;
	public ErrorInfo error;

	public ValidationResult(boolean succeeded, ErrorInfo error){
		this.succeeded = succeeded;
		this.error = error;
	}

	public ValidationResult(boolean succeeded){
		this.succeeded = succeeded;
	}

	public static ValidationResult success = new ValidationResult(true);


	public static ValidationResult failure(ErrorInfo error) {
		ValidationResult result = new ValidationResult(false,error);
		return result;
	}

	public boolean isSucceeded() {
		return this.succeeded;
	}

	public void setSucceeded(boolean succeeded) {
		this.succeeded = succeeded;
	}

	public ValidationResult getSuccess() {
		return this.success;
	}

	public void setSuccess(ValidationResult success) {
		this.success = success;
	}

	public ErrorInfo getErrorInfo() {
		return this.error;
	}

	public void setErrorInfo(ErrorInfo error) {
		this.error = error;
	}
}
