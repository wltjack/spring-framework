package com.wltjack.springdebug.spring.aop.simulate.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * D1
 *
 * @author wltjack
 * Created at 2023/2/1 22:45
 */
@Component
public class D1 implements F1 {
	private static final Logger LOGGER = LogManager.getLogger(D1.class);

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void m1() {
		LOGGER.info("D1 > m1() ...");
	}

}
