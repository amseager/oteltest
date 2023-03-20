package com.example.oteltest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.task.TaskSchedulerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class OteltestApplication {

	public static void main(String[] args) {
		SpringApplication.run(OteltestApplication.class, args);
	}

	@Bean
	public TaskSchedulerCustomizer taskSchedulerCustomizer(MyErrorHandler myErrorHandler) {
		return taskScheduler -> taskScheduler.setErrorHandler(myErrorHandler);
	}
}
