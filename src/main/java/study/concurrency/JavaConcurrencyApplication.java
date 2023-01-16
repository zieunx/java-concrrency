package study.concurrency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class JavaConcurrencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaConcurrencyApplication.class, args);
	}

}
