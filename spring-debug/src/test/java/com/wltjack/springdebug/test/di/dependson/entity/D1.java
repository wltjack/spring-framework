package com.wltjack.springdebug.test.di.dependson.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * D1
 *
 * @author wltjack
 * Created at 2022/12/31 17:46
 */
@Component("d1")
//@DependsOn("d2")
public class D1 {
	private static final Logger LOGGER = LogManager.getLogger(D1.class);

	static {
		LOGGER.info("D1 static");
	}

	@PostConstruct
	public void init() {
		LOGGER.info("D1 init()");
	}
}
