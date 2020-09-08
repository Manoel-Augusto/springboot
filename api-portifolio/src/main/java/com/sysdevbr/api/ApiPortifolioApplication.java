package com.sysdevbr.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.sysdevbr.api.config.property.ApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(ApiProperty.class)
public class ApiPortifolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPortifolioApplication.class, args);
	}

}
