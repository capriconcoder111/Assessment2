package org.AirlineRESTService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AirlineRestApplication {
	
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AirlineRestApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(AirlineRestApplication.class, args);
	}
}
