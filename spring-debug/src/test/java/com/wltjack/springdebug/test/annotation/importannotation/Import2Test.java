package com.wltjack.springdebug.test.annotation.importannotation;

import com.wltjack.springdebug.test.annotation.importannotation.config.ImportTest2Config;
import com.wltjack.springdebug.test.annotation.importannotation.entity.Order;
import com.wltjack.springdebug.test.annotation.importannotation.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * import测试
 *
 * @author wltjack
 * Created at 2022/7/3 21:51
 */
public class Import2Test {

	@Test
	void testImport() {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ImportTest2Config.class);

		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}

		System.out.println("===================");

		User userBean = context.getBean("com.wltjack.springdebug.test.annotation.importannotation.entity.User", User.class);
		userBean.test();

		Order orderBean = context.getBean(Order.class);
		orderBean.test();
	}
}
