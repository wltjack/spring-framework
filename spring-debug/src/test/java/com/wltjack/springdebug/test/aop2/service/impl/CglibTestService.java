package com.wltjack.springdebug.test.aop2.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class CglibTestService {
	private static final Logger LOGGER = LogManager.getLogger(CglibTestService.class);

	public void method1() {
		LOGGER.info("CglibTestService > method1");
	}

}
