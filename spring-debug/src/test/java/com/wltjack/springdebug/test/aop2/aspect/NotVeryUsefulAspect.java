package com.wltjack.springdebug.test.aop2.aspect;

import com.wltjack.springdebug.test.aop2.service.UsageTrackedService;
import com.wltjack.springdebug.test.aop2.service.impl.UsageTrackedServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.annotation.Retention;

/**
 * NotVeryUsefulAspect
 *
 * @author wltjack
 * Created at 2023/6/8 9:54
 */
public class NotVeryUsefulAspect {
	private static final Logger LOGGER = LogManager.getLogger(NotVeryUsefulAspect.class);

	//	@Component
	@Aspect
	public static class Aspect1 {
		// execution表达式的最小粒度是方法
		@Pointcut("execution(* com.wltjack.springdebug.test.aop2.service..*.*(..))")
		public void pointCutPackage() {

		}

		@Before("pointCutPackage()")
		public void adviceBefore() {
			LOGGER.info("before aop（1）");
		}
	}

	//	@Component
	@Aspect
	public static class Aspect2 {
		// within表达式的最小粒度是类
		@Pointcut("within(com.wltjack.springdebug.test.aop2.service.impl.AServiceImpl)")
		public void pointWithIn() {

		}

		@Before("pointWithIn()")
		public void adviceBefore() {
			LOGGER.info("before aop（2）");
		}
	}


	//	@Component
	@Aspect
	public static class Aspect3 {
		// args 指定参数类型及个数
		@Pointcut("args(Integer)")
		public void pointArgs() {

		}

		@Before("pointArgs()")
		public void adviceBefore() {
			LOGGER.info("before aop（3）");
		}
	}


	//	@Component
	@Aspect
	public static class Aspect4 {
		// this 表示生成的代理对象和预期符合
//		@Pointcut("this(com.wltjack.springdebug.test.aop2.service.AService)")
//		@Pointcut("this(com.wltjack.springdebug.test.aop2.service.impl.AServiceImpl)")
//		@Pointcut("this(com.wltjack.springdebug.test.aop2.service.BService)")
		@Pointcut("this(com.wltjack.springdebug.test.aop2.service.impl.CglibTestService)")
		public void pointCutThis() {

		}

		@Before("pointCutThis()")
		public void adviceBefore() {
			LOGGER.info("before aop（4）");
		}
	}

	//	@Component
	@Aspect
	public static class Aspect5 {
		// target 表示目标对象和预期符合
//		@Pointcut("target(com.wltjack.springdebug.test.aop2.service.AService)")
		@Pointcut("target(com.wltjack.springdebug.test.aop2.service.impl.AServiceImpl)")
//		@Pointcut("target(com.wltjack.springdebug.test.aop2.service.BService)")
//		@Pointcut("target(com.wltjack.springdebug.test.aop2.service.impl.CglibTestService)")
		public void pointCutTarget() {

		}

		@Before("pointCutTarget()")
		public void adviceBefore() {
			LOGGER.info("before aop（5）");
		}
	}

	//	@Component
	@Aspect
	public static class Aspect6 {

		@DeclareParents(value = "com.wltjack.springdebug.test.aop2.service.*+", defaultImpl = UsageTrackedServiceImpl.class)
		public static UsageTrackedService mixin;

//		@Before("com.wltjack.springdebug.test.aop2.service..*.*(..) && this(usageTrackedService)")
//		public void recordUsage(UsageTrackedService usageTrackedService) {
//			mixin.incrementUseCount();
//		}


//		@Before("pointCutTarget()")
//		public void adviceBefore() {
//			LOGGER.info("before aop（6）");
//		}


	}


	@Component
	@Aspect
	public static class Aspect7 {
		@Pointcut("@args(com.wltjack.springdebug.test.aop2.anno.AopTestAnno)")
		public void pointArgs() {

		}

		@Before("pointArgs()")
		public void adviceBefore() {
			LOGGER.info("before aop（7）");
		}
	}

}
