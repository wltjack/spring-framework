package com.wltjack.springdebug.test.scan2.bean;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class P {
	private static final Logger LOGGER = LogManager.getLogger(P.class);
	public P(){
		LOGGER.info("create p");
	}
}
