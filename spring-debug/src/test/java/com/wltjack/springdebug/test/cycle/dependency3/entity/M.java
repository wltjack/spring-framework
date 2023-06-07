package com.wltjack.springdebug.test.cycle.dependency3.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * M
 *
 * @author wltajck
 * Created at 2023/2/19 16:45
 */
@Component
public class M {
	private static final Logger LOGGER = LogManager.getLogger(M.class);

	@Autowired
	N n;

	public M() {
		LOGGER.info("M constructor ...");
	}

	public void printf() {
		LOGGER.info("M 打印日志...");
	}
}
