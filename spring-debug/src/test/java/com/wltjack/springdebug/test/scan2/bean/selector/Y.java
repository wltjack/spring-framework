package com.wltjack.springdebug.test.scan2.bean.selector;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Y {
	private static final Logger LOGGER = LogManager.getLogger(Y.class);

	public Y(){
		LOGGER.info("create y");
	}
}
