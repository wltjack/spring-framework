package com.wltjack.springdebug.test.lifecycle.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 测试aop
 *
 * @author wltjack
 * Created at 2023/1/26 20:13
 */
@Component
@Aspect
public class LifeCycleTestAspect {
	private static final Logger LOGGER = LogManager.getLogger(LifeCycleTestAspect.class);

//	@Pointcut("within(com.wltjack.springdebug.test.lifecycle.**.*)")
	@Pointcut("within(com.wltjack.springdebug.test.lifecycle.bean.ABean)")
	private void pointcut() {
	}

	@Before("pointcut()")
	public void before() {
		LOGGER.info("apo before() ...");
	}
}
