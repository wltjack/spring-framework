package com.wltjack.springdebug.test.scan.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.PostConstruct;

/**
 * C
 *
 * @author wltjack
 * Created at 2023/3/7 21:37
 */
public class C {
	private static final Logger LOGGER = LogManager.getLogger(C.class);

	@PostConstruct
	public void init() {
		LOGGER.info("c init()");
	}
}
