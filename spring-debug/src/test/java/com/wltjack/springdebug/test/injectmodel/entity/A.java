package com.wltjack.springdebug.test.injectmodel.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * A
 *
 * @author kangliang
 * Created at 2022/11/27 16:13
 */
@Component
public class A {
	private static final Logger LOGGER = LogManager.getLogger(A.class);

	public A() {
		LOGGER.info("默认构造方法 - A()");
	}

	public A(B1 b1) {
		LOGGER.info("构造方法 - A(B1 b1)");
	}

	public A(B1 b1, C1 c1) {
		LOGGER.info("构造方法 - A(B1 b1, C1 c1)");
	}

	public A(B1 b1, M1 m1) {
		LOGGER.info("构造方法 - A(B1 b1, M1 m1)");
	}

	public A(C1 c1) {
		LOGGER.info("默认构造方法 - A(C1 c1)");
	}

	public A(M1 m1) {
		LOGGER.info("默认构造方法 - A(M1 m1)");
	}

}
