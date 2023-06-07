package com.wltjack.springdebug.test.scan2.bean;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class O {
	private static final Logger LOGGER = LogManager.getLogger(O.class);
	public O(){
		LOGGER.info("create o");
	}
}
