package com.wltjack.springdebug.test.scan.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * A
 *
 * @author wltjack
 * Created at 2023/3/7 21:33
 */
@Component
@ComponentScan("com.wltjack.springdebug.test.scan.other")
public class A {
	private static final Logger LOGGER = LogManager.getLogger(A.class);

	@PostConstruct
	public void init() {
		LOGGER.info("a init()");
	}

	@Bean
	public C c() {
		return new C();
	}
}
