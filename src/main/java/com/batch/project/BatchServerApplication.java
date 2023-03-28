package com.batch.project;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing // Spring Batch 기능 활성화
@SpringBootApplication
public class BatchServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchServerApplication.class, args);
	}

}
