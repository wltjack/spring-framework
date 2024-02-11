package com.wltjack.springdebug.test.aop3.service.impl;

import com.wltjack.springdebug.test.aop3.service.AopTestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service("CAopTestService")
public class CAopTestServiceImpl implements AopTestService {
	private static final Logger LOGGER = LogManager.getLogger(CAopTestServiceImpl.class);

	@Override
	public void m() {
		LOGGER.info("c - m()");
	}

	@Override
	public String m1(Integer i) {
		LOGGER.info("c - m1()");
		return "c - m1 impl()";
	}
}
