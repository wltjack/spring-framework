package com.wltjack.springdebug.test.scan.bean.inherited;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.PostConstruct;

/**
 * SImpl
 *
 * @author wltjack
 * Created at 2023/4/9 9:51
 */
public class SImpl implements ISBean {

	private static final Logger LOGGER = LogManager.getLogger(Sinherited.class);

	@PostConstruct
	public void init() {
		LOGGER.info("SImpl > init()");
	}
}
