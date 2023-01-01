package com.wltjack.springdebug.test.injectmodel.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * M1
 *
 * @author kangliang
 * Created at 2022/11/27 16:17
 */
@Component
public class M1 {
	private static final Logger LOGGER = LogManager.getLogger(M1.class);

	private N1 n1;

	public M1() {
		LOGGER.info("默认构造方法 - M1()");
	}

	public N1 getN1() {
		return n1;
	}

//	@Autowired
	public void setN1(N1 n1) {
		this.n1 = n1;
		LOGGER.info("setter方法 - setN1(N1 n1)");
	}
}
