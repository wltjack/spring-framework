package com.wltjack.springdebug.test.aop3.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * NotVeryUsefulAspect
 *
 * @author wltjack
 * Created at 2023/6/8 9:54
 */
public class NotVeryUsefulAspect {
	private static final Logger LOGGER = LogManager.getLogger(NotVeryUsefulAspect.class);


	@Component
	@Aspect
	public static class Aspect1 {
		@Pointcut("within(com.wltjack.springdebug.test.aop3.service.impl.*AopTestServiceImpl)")
		public void pointCutWithinAAopService(){

		}

		@Before("pointCutWithinAAopService()")
		public void adviceBeforeAAopService(){
			LOGGER.info("=======before aop service========");
		}

		@After("pointCutWithinAAopService()")
		public void adviceAfterAAopService(){
			LOGGER.info("=======after aop service========");
		}
	}

}
