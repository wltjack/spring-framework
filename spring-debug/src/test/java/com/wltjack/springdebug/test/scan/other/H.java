package com.wltjack.springdebug.test.scan.other;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * H
 *
 * @author wltjack
 * Created at 2023/3/7 21:35
 */
@Component
public class H {
	private static final Logger LOGGER = LogManager.getLogger(H.class);

	@PostConstruct
	public void init() {
		LOGGER.info("h init()");
	}
}
