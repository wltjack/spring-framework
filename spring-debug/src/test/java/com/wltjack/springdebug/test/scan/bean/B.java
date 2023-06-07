package com.wltjack.springdebug.test.scan.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * B
 *
 * @author wltjack
 * Created at 2023/3/7 21:35
 */
@Component
public class B {
	private static final Logger LOGGER = LogManager.getLogger(B.class);

	@PostConstruct
	public void init() {
		LOGGER.info("b init()");
	}
}
