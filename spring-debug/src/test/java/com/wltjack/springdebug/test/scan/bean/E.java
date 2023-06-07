package com.wltjack.springdebug.test.scan.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.PostConstruct;

/**
 * E
 *
 * @author wltajck
 * Created at 2023/3/13 22:51
 */
public class E implements ID {
	private static final Logger LOGGER = LogManager.getLogger(E.class);
	@PostConstruct
	public void init() {
		LOGGER.info("E init()");
	}

}
