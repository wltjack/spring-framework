package com.wltjack.springdebug.test.scan2.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;


@Component
@Import(P.class)
public class A {
	private static final Logger LOGGER = LogManager.getLogger(A.class);

	public A() {
		LOGGER.info("create a");
	}

}
