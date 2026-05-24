package com.Quizz.quizzApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.Quizz")
@org.springframework.boot.persistence.autoconfigure.EntityScan("com.Quizz.model")
@EnableJpaRepositories(basePackages = "com.Quizz.repository")
public class QuizzAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizzAppApplication.class, args);
	}

}
