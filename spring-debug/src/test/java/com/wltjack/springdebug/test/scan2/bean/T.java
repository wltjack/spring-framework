package com.wltjack.springdebug.test.scan2.bean;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class T {
	private static final Logger LOGGER = LogManager.getLogger(T.class);
	public T(){
		LOGGER.info("create t");
	}
}