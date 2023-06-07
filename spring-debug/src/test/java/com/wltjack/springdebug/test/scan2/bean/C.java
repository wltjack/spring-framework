package com.wltjack.springdebug.test.scan2.bean;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class C {
	private static final Logger LOGGER = LogManager.getLogger(C.class);
	public C(){
		LOGGER.info("create c");
	}
}
