package com.wltjack.springdebug.test.scan.bean.inherited;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.PostConstruct;

/**
 * Sinherited
 *
 * @author wltjack
 * Created at 2023/4/9 9:52
 */
public class Sinherited extends Pinherited {
	private static final Logger LOGGER = LogManager.getLogger(Sinherited.class);

	@PostConstruct
	public void init() {
		LOGGER.info("Sinherited > init()");
	}
}
