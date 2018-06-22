package archway.seedwork.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		DemoGreeter greeter = new DemoGreeter();
		System.out.println(greeter.sayHello());
	}
}
