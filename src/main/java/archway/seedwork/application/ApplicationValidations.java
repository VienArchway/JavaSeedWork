package archway.seedwork.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationValidations {

	/*
		Define ValidationResult class
	*/
	public class ValidationResult {
		public ValidationResult success;
		public boolean succeeded = true;
		public ErrorInfo error;

		public ValidationResult failure(ErrorInfo error){
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
			Get; Private Set for boolean
		*/
		public boolean getSucceeded() {
			return succeeded;
		}

		public void setSucceeded(boolean succeeded) {
			this.succeeded = succeeded;
		}

		/*
			Get; Private Set for validationResult
		*/
		public ValidationResult getValidationResult() {
			return success;
		}

		public void setValidationResult(boolean succeeded) {
			succeeded = true;
		}

		/*
			Get; Private Set for ErrorInfo
		*/
		public ErrorInfo getErrorInfo() {
			return error;
		}

		public void setErrorInfo(ErrorInfo error) {
			this.error = error;
		}
	} 
}
