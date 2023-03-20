package com.example.oteltest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyScheduler {

	@Scheduled(fixedRate = 10000)
	public void test() {
		log.info("test1");
		throw new RuntimeException("test2");
	}
}
