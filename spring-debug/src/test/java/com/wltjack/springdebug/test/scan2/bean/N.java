package com.wltjack.springdebug.test.scan2.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;

public class N {
	private static final Logger LOGGER = LogManager.getLogger(N.class);

	public N(){
		LOGGER.info("create n");
	}

	@Bean
	public P p(){
		return new P();
	}
}
