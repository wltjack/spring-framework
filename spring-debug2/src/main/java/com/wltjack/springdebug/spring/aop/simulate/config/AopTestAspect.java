package com.wltjack.springdebug.spring.aop.simulate.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
@EnableMyAspectAop
public class AopTestAspect {
	private static final Logger LOGGER = LogManager.getLogger(AopTestAspect.class);

	@Pointcut("within(com.wltjack.springdebug.spring.aop.simulate.**.*)")
	private void pointcut() {
	}

	@Before("pointcut()")
	public void before() {
		LOGGER.info("apo before() ...");
	}
}
