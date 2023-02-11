package com.wltjack.springdebug.test.lifecycle.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * BBean
 *
 * @author wltjack
 * Created at 2023/1/26 19:48
 */
@Component
public class BBean {
	private static final Logger LOGGER = LogManager.getLogger(BBean.class);

	public void m0() {
		LOGGER.info("BBean m0()");
	}
}
