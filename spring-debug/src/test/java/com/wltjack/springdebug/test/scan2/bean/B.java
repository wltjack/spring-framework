package com.wltjack.springdebug.test.scan2.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;



@Component
public class B {
	private static final Logger LOGGER = LogManager.getLogger(B.class);
	public B(){
		LOGGER.info("create b");
	}
}
