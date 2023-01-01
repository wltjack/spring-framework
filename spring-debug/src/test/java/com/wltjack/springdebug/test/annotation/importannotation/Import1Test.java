package com.wltjack.springdebug.test.annotation.importannotation;

import com.wltjack.springdebug.test.annotation.importannotation.config.ImportTest1Config;
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
public class Import1Test {

	@Test
	void testImport() {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ImportTest1Config.class);

		User userBean = context.getBean("getUserBean", User.class);
		userBean.test();

		userBean = context.getBean("com.wltjack.springdebug.test.annotation.importannotation.entity.User", User.class);
		userBean.test();

		Order orderBean = context.getBean(Order.class);
		orderBean.test();
	}
}
