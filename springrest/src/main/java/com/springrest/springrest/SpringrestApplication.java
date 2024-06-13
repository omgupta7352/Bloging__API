package com.springrest.springrest;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication



@PropertySource("classpath:application.properties")
@ComponentScan("com.jatyap.ordermgmt")
@EntityScan("com.jatyap.ordermgmt.entity")
@EnableJpaRepositories("com.jatyap.ordermgmt.repository")
public class SpringrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}

}
