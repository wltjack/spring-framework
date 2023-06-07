package com.wltjack.springdebug.test.scan3.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Import;

@Import(E.class)
public class CC {

	private static final Logger LOGGER = LogManager.getLogger(CC.class);

	public CC() {
		LOGGER.info("create cc");
	}
}
