package com.example.oteltest;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.ErrorHandler;

@Component
@Slf4j
public class MyErrorHandler implements ErrorHandler {

	@Override
	public void handleError(Throwable t) {
		log.error("caught: ", t);
	}
}
