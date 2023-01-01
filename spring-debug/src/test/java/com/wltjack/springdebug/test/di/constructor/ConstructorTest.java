package com.wltjack.springdebug.test.di.constructor;

import com.wltjack.springdebug.test.di.constructor.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring构造函数推断 测试
 *
 * @author wltjack
 * Created at 2022/5/7 23:39
 */
public class ConstructorTest {

	@Test
	void testConstructor() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AopConfig.class);
		ProductService productService = context.getBean(ProductService.class);
		productService.test();
	}
}
