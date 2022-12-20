package com.loda.brd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LodaServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LodaServerApplication.class, args);
	}

}
