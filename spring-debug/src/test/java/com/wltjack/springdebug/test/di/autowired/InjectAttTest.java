package com.wltjack.springdebug.test.di.autowired;

import com.wltjack.springdebug.test.di.autowired.entity.A;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring注入属性测试
 *
 * @author kangliang
 * Created at 2022/11/27 21:00
 */
public class InjectAttTest {

	@Test
	void autowiredBean() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.wltjack.springdebug.test.injectattr.autowired");
		context.refresh();

		System.out.println(context.getBean(A.class));
	}
}
