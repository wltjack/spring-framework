package com.wltjack.springdebug.test.aop3.advice;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * BeforeAdvice
 *
 * @author wltjack
 * Created at 2023/6/8 21:57
 */
public class MyBeforeAdvice implements MethodInterceptor {
	private static final Logger LOGGER = LogManager.getLogger(MyBeforeAdvice.class);

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		LOGGER.info("方法调用before");
		return invocation.proceed();
	}
}
