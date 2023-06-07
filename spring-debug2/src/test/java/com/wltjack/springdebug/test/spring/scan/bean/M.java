package com.wltjack.springdebug.test.spring.scan.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * M
 *
 * @author wltjack
 * Created at 2023/3/5 21:52
 */
@Component
public class M {
	private static final Logger LOGGER = LogManager.getLogger(M.class);

	@PostConstruct
	public void init() {
		LOGGER.info("M init()");
	}

}
