package com.kstrek.wtto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class WttoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WttoApplication.class, args);
	}
}
