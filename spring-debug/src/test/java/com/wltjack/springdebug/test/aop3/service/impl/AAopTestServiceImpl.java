package com.wltjack.springdebug.test.aop3.service.impl;

import com.wltjack.springdebug.test.aop3.service.AopTestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service("AAopTestService")
public class AAopTestServiceImpl implements AopTestService {
	private static final Logger LOGGER = LogManager.getLogger(AAopTestServiceImpl.class);

	@Override
	public void m() {
		LOGGER.info("a - m()");
	}
}
