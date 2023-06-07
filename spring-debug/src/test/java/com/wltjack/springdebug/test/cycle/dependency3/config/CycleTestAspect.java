package com.wltjack.springdebug.test.cycle.dependency3.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * NotVeryUsefulAspect
 *
 * @author wltjack
 * Created at 2023/2/19 17:01
 */
@Aspect
@Component
public class CycleTestAspect {
	private static final Logger LOGGER = LogManager.getLogger(CycleTestAspect.class);

	@Pointcut("within(com.wltjack.springdebug.test.cycle.dependency3.entity.M)")
	public void pointcut() {

	}

	@Before("pointcut()")
	public void before() {
		LOGGER.info("apo before ...");
	}

}
