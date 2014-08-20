package com.apple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.apple")
@EntityScan("com.fujitaka")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
