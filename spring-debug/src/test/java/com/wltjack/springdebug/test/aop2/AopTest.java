package com.wltjack.springdebug.test.aop2;

import com.wltjack.springdebug.test.aop2.config.AppConfig;
import com.wltjack.springdebug.test.aop2.service.AService;
import com.wltjack.springdebug.test.aop2.service.BService;
import com.wltjack.springdebug.test.aop2.service.UsageTrackedService;
import com.wltjack.springdebug.test.aop2.service.impl.AnnotationArgsService;
import com.wltjack.springdebug.test.aop2.service.impl.CglibTestService;
import com.wltjack.springdebug.test.aop2.vo.MyParameter;
import com.wltjack.springdebug.test.aop2.vo.MyParameterWithAnno;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AopTest
 *
 * @author AopTest
 * Created at 2023/6/8 10:26
 */
public class AopTest {

	@Test
	void aop() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		AService aService = (AService) context.getBean("AService");
		aService.method1();
		aService.methodIntegerArgs(123);
		aService.methodIntegerMultiArgs(1, "s");

		BService bService = context.getBean(BService.class);
		bService.methodOther();

		CglibTestService cglibTestService = context.getBean(CglibTestService.class);
		cglibTestService.method1();
	}


	@Test
	void aopIntroductions() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		AService aService = (AService) context.getBean("AService");
		aService.method1();
		aService.methodIntegerArgs(123);
		aService.methodIntegerMultiArgs(1, "s");

		BService bService = context.getBean(BService.class);
		bService.methodOther();

		CglibTestService cglibTestService = context.getBean(CglibTestService.class);
		cglibTestService.method1();


		UsageTrackedService usageTrackedService = (UsageTrackedService) context.getBean(BService.class);
		System.out.println(usageTrackedService.test());

		UsageTrackedService usageTrackedService2 = (UsageTrackedService) context.getBean("defaultUsageTrackedService");
		System.out.println(usageTrackedService2.getUseCount());


	}

	@Test
	public void testAopAnnotationArgs() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);

		AnnotationArgsService service = context.getBean(AnnotationArgsService.class);
		service.method1(new MyParameter());
		service.method2(new MyParameterWithAnno());
		service.method3(new MyParameterWithAnno(), 1);

	}

}
