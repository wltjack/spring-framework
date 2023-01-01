package com.wltjack.springdebug.test.cycle.dependency;

import com.wltjack.springdebug.cycle.dependency.entity.A1;
import com.wltjack.springdebug.cycle.dependency.entity.B1;
import com.wltjack.springdebug.cycle.dependency.entity.C1;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 循环依赖测试
 *
 * @author wltjack
 * Created at 2022/4/7 22:38
 * @since v1.0
 */
public class CycleTest {

	@Test
	void cycle() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cycle.xml");
		A1 bean = ctx.getBean(A1.class);
		System.out.println(bean.getB1());

		B1 bean1 = ctx.getBean(B1.class);
		System.out.println(bean1.getA1());

		C1 bean2 = ctx.getBean(C1.class);
		System.out.println(bean2);
	}
}
