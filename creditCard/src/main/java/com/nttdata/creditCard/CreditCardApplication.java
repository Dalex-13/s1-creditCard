package com.nttdata.creditCard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class CreditCardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditCardApplication.class, args);
	}

}
