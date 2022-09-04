package info.nenado.book;

import info.nenado.config.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApplication {

	public static void main(String[] args) {

		SpringApplication.run(new Class<?>[] {BookApplication.class, JpaConfig.class}, args);
	}

}
