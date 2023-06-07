package com.wltjack.springdebug.test.scan2.bean;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class F {
	private static final Logger LOGGER = LogManager.getLogger(F.class);
	public F(){
		LOGGER.info("create f");
	}
}
