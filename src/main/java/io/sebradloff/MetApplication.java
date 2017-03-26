package io.sebradloff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("io.sebradloff")
public class MetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetApplication.class, args);
	}
}
