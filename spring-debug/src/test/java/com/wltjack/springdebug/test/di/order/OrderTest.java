package com.wltjack.springdebug.test.di.order;

import com.wltjack.springdebug.test.di.order.config.OrderTestConfig;
import com.wltjack.springdebug.test.di.order.entity.E;
import com.wltjack.springdebug.test.di.order.entity.T;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * 顺序测试
 *
 * @author wltjack
 * Created at 2022/12/18 18:35
 */
public class OrderTest {

	@Test
	void orderTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(OrderTestConfig.class);
		context.refresh();

		List<E> bfpps = context.getBean(T.class).getBfpps();
		for (E bfpp : bfpps) {
			bfpp.printOrder();
		}
	}
}
