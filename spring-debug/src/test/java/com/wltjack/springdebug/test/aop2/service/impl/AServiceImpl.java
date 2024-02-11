package com.wltjack.springdebug.test.aop2.service.impl;

import com.wltjack.springdebug.test.aop2.service.AService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service("AService")
public class AServiceImpl implements AService {
	private static final Logger LOGGER = LogManager.getLogger(AServiceImpl.class);

	@Override
	public void method1() {
		LOGGER.info("A service > general method1");
	}

	@Override
	public void methodIntegerArgs(Integer i) {
		LOGGER.info("A service > methodIntegerArgs1 integer:[{}]", i);
	}

	@Override
	public void methodIntegerMultiArgs(Integer i, String s) {
		LOGGER.info("A service > methodIntegerMultiArgs1 integer:[{}] string[{}]", i, s);
	}
}
