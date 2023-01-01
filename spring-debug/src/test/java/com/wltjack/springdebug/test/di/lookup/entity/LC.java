package com.wltjack.springdebug.test.di.lookup.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * LC
 *
 * @author kangliang
 * Created at 2022/12/18 22:45
 */
@Component
public abstract class LC {
	private static final Logger LOGGER = LogManager.getLogger(LC.class);

	public void printInfo() {
		LB b = getB();
		LOGGER.info("lb = {}", b);
		b = getB();
		LOGGER.info("lb = {}", b);
	}

	@Lookup
	public abstract LB getB();
}
