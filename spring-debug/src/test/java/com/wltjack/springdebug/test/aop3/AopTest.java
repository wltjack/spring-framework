package com.wltjack.springdebug.test.aop3;

import com.wltjack.springdebug.test.aop3.config.AppConfig;
import com.wltjack.springdebug.test.aop3.service.AopTestService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AopTest
 *
 * @author wltjack
 * Created at 2023/6/8 10:26
 */
public class AopTest {

	@Test
	void aop() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		AopTestService aService = (AopTestService) context.getBean("AAopTestService");
		aService.m();

		AopTestService bService = (AopTestService) context.getBean("BAopTestService");
		bService.m();
	}



}
