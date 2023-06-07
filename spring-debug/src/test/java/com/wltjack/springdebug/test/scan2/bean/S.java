package com.wltjack.springdebug.test.scan2.bean;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class S {
	private static final Logger LOGGER = LogManager.getLogger(S.class);

	public S(){
		LOGGER.info("create s");
	}
}
