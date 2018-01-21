package com.coell.Coell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(value = "com.coell.Coell.security")
public class CoellApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoellApplication.class, args);
	}
}
