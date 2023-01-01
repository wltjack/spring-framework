package com.wltjack.springdebug.test.bfpp;

import com.wltjack.springdebug.bfpp.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * MyBfpp测试
 *
 * @author wltjack
 * Created at 2022/4/20 23:22
 * @since v1.0
 */
public class MyBfppTest {

	@Test
	void testBfpp() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("myBfpp.xml");
		Person bean = ctx.getBean(Person.class);
		System.out.println(bean);
	}
}
