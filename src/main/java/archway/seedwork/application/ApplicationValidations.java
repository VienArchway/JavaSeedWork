package archway.seedwork.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationValidations {

	public static ValidationResult notEmpty(String val, String name) {
		if (val == null || isWhitespace(val)) {
			return ValidationResult
					.failure(new ErrorInfo(name.toLowerCase().trim() + "empty", name + "must not be empty!"));
		}

		return ValidationResult.success;
	}

	public static ValidationResult notFound(Object o, String name) {
		if (o == null) {
			return ValidationResult
					.failure(new ErrorInfo(name.toLowerCase().trim() + "empty", name + "not found!"));
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
	static ValidationResult success;
	boolean succeeded = true;
	ErrorInfo error;

	public static ValidationResult failure(ErrorInfo error) {
		return new ValidationResult() {
			@Override
			public void setSucceeded(boolean succeeded) {
				succeeded = false;
			}

			@Override
			public void setErrorInfo(ErrorInfo error) {
				this.error = error;
			}
		};
	}

	/*
	 * Get; Private Set for boolean
	 */
	public boolean isSucceeded() {
		return this.succeeded;
	}

	public void setSucceeded(boolean succeeded) {
		this.succeeded = succeeded;
	}

	/*
	 * Get; Private Set for validationResult
	 */
	// public ValidationResult getSuccess() {
	// 	return this.success;
	// }

	// public void setSuccess(boolean success) {
	// 	setSucceeded(success);
	// }

	/*
	 * Get; Private Set for ErrorInfo
	 */
	public ErrorInfo getErrorInfo() {
		return error;
	}

	public void setErrorInfo(ErrorInfo error) {
		this.error = error;
	}
}
