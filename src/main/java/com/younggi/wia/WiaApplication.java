package com.younggi.wia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class WiaApplication {

	private static final Logger logger = LoggerFactory.getLogger(WiaApplication.class);

	public static void main(String[] args) {

		logger.info("Hello test logback");

		SpringApplication.run(WiaApplication.class, args);
	}

}
