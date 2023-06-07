package com.wltjack.springdebug.test.scan.bean.inherited;

import com.wltjack.springdebug.test.scan.annotation.IsInherited;
import com.wltjack.springdebug.test.scan.annotation.NoInherited;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.PostConstruct;

/**
 * Pinherited
 *
 * @author wltjack
 * Created at 2023/4/9 9:50
 */
@IsInherited
@NoInherited
public class Pinherited {

	private static final Logger LOGGER = LogManager.getLogger(Sinherited.class);

	@PostConstruct
	public void init() {
		LOGGER.info("Pinherited > init()");
	}
}
