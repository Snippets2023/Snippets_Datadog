package com.example.DataDog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.metrics.export.datadog.EnableDatadogMetrics;

@SpringBootApplication
@EnableDatadogMetrics
public class DataDogApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataDogApplication.class, args);
	}

}
