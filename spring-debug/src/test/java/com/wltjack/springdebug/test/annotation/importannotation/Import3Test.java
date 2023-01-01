package com.wltjack.springdebug.test.annotation.importannotation;

import com.wltjack.springdebug.test.annotation.importannotation.config.ImportTest3Config;
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
public class Import3Test {

	@Test
	void testImport() {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ImportTest3Config.class);

		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}

		System.out.println("===================");

		User userBean = context.getBean("user", User.class);
		userBean.test();

		Order orderBean = context.getBean(Order.class);
		orderBean.test();
	}
}
