package com.wltjack.springdebug.test.aop3.service.impl;

import com.wltjack.springdebug.test.aop3.service.AopTestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service("BAopTestService")
public class BAopTestServiceImpl implements AopTestService {
	private static final Logger LOGGER = LogManager.getLogger(BAopTestServiceImpl.class);

	@Override
	public void m() {
		LOGGER.info("b - m()");
	}
}
