package com.wltjack.springdebug.test.cycle.dependency3.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * N
 *
 * @author wltjack
 * Created at 2023/2/19 16:49
 */
@Component
public class N implements InitializingBean {
	private static final Logger LOGGER = LogManager.getLogger(N.class);

	@Autowired
	private M m;

	public N() {
		LOGGER.info("N constructor ...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		LOGGER.info("N afterPropertiesSet() -- 调用m.printf()");
		m.printf();
	}
}
