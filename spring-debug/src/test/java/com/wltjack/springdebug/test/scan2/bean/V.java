package com.wltjack.springdebug.test.scan2.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;


public class V {
	private static final Logger LOGGER = LogManager.getLogger(V.class);

	public V() {
		LOGGER.info("create v");
	}

	@Bean
	public T t() {
		return new T();
	}
}
