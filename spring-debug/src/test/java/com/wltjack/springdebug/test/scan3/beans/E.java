package com.wltjack.springdebug.test.scan3.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class E {
	private static final Logger LOGGER = LogManager.getLogger(E.class);
	public E(){
		LOGGER.info("create e");
	}

}
