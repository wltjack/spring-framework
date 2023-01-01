package com.wltjack.springdebug.test.aop;

import com.wltjack.springdebug.test.aop.service.OrderService;
import com.wltjack.springdebug.test.aop.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AopTest
 *
 * @author wltjack
 * Created at 2022/5/4 22:22
 */
public class AopTest {

	@Test
	void aop() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AopConfig.class);
		OrderService orderService = context.getBean(OrderService.class);
		UserService userService = context.getBean(UserService.class);
		orderService.test();
		userService.test();
	}


}
