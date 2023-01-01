package com.wltjack.springdebug.test.di.autowired;

import com.wltjack.springdebug.test.di.autowired.service.OrderService;
import com.wltjack.springdebug.test.di.autowired.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Autowired注入测试
 *
 * @author wltjack
 * Created at 2022/5/4 16:55
 */
public class AutowiredTest {

	@Test
	void autowired() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		OrderService orderService = context.getBean(OrderService.class);
		UserService userService = context.getBean(UserService.class);
		orderService.test();
		userService.test();
	}
}
