package com.wltjack.springdebug.test.scan2.bean.selector;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Z {
	private static final Logger LOGGER = LogManager.getLogger(Z.class);

	public Z(){
		LOGGER.info("create z");
	}
}
