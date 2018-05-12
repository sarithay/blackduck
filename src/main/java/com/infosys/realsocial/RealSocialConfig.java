package com.infosys.realsocial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.infosys.realsocial.repository")
public class RealSocialConfig {

	
	public static void main(String[] args) {
		SpringApplication.run(RealSocialConfig.class, args);
	}
	
	public void run() {
	}
}
