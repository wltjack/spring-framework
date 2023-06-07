package com.wltjack.springdebug.test.scan2.bean;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class D extends V implements I {
	private static final Logger LOGGER = LogManager.getLogger(D.class);

	public D() {
		LOGGER.info("create d");
	}
}
