package com.alam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.alam.repo")
@EntityScan("com.alamentity")
@ComponentScan(basePackages = "com.alam.controller")
public class IcicibankApplication {

	public static void main(String[] args) {
		SpringApplication.run(IcicibankApplication.class, args);
	}

}
