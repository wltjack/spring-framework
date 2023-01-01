package com.wltjack.springdebug.test.di.dependson.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * D2
 *
 * @author wltjack
 * Created at 2022/12/31 17:47
 */
@Component("d2")
public class D2 {
	private static final Logger LOGGER = LogManager.getLogger(D2.class);

	static {
		LOGGER.info("D2 static");
	}

	@PostConstruct
	public void init() {
		LOGGER.info("D2 init()");
	}


}
