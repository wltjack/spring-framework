package com.wltjack.springdebug.test.scan2.bean.selector;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;

public class X {
	private static final Logger LOGGER = LogManager.getLogger(X.class);

	public X(){
		LOGGER.info("create x");
	}
}
