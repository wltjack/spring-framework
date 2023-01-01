package com.wltjack.springdebug.test.di.lookup.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * LA 单例类
 *
 * @author kangliang
 * Created at 2022/12/18 22:41
 */
@Component
public class LA {
	private static final Logger LOGGER = LogManager.getLogger(LA.class);

	@Autowired
	private LB b;

	public void printInfo() {
		LOGGER.info("b = {}", b);

		LOGGER.info("b = {}", b);
	}
}
