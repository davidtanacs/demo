package com.connectFB.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.social.facebook.api.impl.FacebookTemplate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		FacebookTemplate facebookTemplate = new FacebookTemplate("EAAc4ZBCq6ZBZCcBAPbX4r2zHCC71PmxkI412Rl3lqpUYx65gsrIvmdjTLWsXe7KW9qBRen13rLcURmulZCCvuzAfHH47b5CFVUVL1jdQ4iKyAsBf9UlajDDLIPBHZBZBZAZBmCzAm0fiQ3FPZAKPTCyKJqoGJSpnDSpk2XGE7LZA5XNl7zre09jx4hsAEvB6oD0dgsZCPC2gM2bYwZDZD");
		facebookTemplate.setApiVersion("2.8");
	}
}
