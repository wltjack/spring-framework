package com.wltjack.springdebug.test.aop2.service.impl;

import com.wltjack.springdebug.test.aop2.service.BService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class BServiceImpl implements BService {
	private static final Logger LOGGER = LogManager.getLogger(BServiceImpl.class);

	@Override
	public void methodOther() {
		LOGGER.info("B service > methodOther ");
	}
}
