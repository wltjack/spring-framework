package com.wltjack.springdebug.spring.aop.simulate.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * E1
 *
 * @author wltjack
 * Created at 2023/2/1 22:48
 */
@Component
public class E1 {
	private static final Logger LOGGER = LogManager.getLogger(E1.class);

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void m1() {
		LOGGER.info("E1 > m1() ...");
	}

}
