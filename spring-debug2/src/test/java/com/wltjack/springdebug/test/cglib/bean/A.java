package com.wltjack.springdebug.test.cglib.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A
 *
 * @author wltjack
 * Created at 2023/6/1 21:39
 */
public class A {
	private static final Logger LOGGER = LogManager.getLogger(A.class);

	public A() {
		LOGGER.info("A create");
	}

	public void m0() {
		LOGGER.info("-----===m0===========");
	}

	public void m1() {
		LOGGER.info("-----===m1===========");
	}

	public void m2() {
		LOGGER.info("-----===m2===========");
	}

}
