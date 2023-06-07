package com.wltjack.springdebug.test.scan2.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;


@Import(F.class)
public class E {
	private static final Logger LOGGER = LogManager.getLogger(E.class);

	public E(){
		LOGGER.info("create e");
	}

	@Bean
	public O o(){
		return new O();
	}
}
