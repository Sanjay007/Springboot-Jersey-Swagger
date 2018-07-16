package com.frugalis.SpringBootJersey;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"com.frugalis.*","com.frugalis.resources"})
public class SpringBootJerseyApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJerseyApplication.class, args);
	}
}
