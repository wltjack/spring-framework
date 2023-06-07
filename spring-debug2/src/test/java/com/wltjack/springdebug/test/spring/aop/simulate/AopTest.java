package com.wltjack.springdebug.test.spring.aop.simulate;

import com.wltjack.springdebug.spring.aop.simulate.config.AopTestConfig1;
import com.wltjack.springdebug.spring.aop.simulate.entity.E1;
import com.wltjack.springdebug.spring.aop.simulate.entity.F1;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AopTest
 *
 * @author wltjack
 * Created at 2023/2/1 22:53
 */
public class AopTest {

	@Test
	public void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopTestConfig1.class);
		F1 f1 = context.getBean(F1.class);
		f1.m1();
		E1 e1 = context.getBean(E1.class);
		e1.m1();
	}

	@Test
	public void test2(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopTestConfig1.class);
		F1 f1 = context.getBean(F1.class);
		f1.m1();
		E1 e1 = context.getBean(E1.class);
		e1.m1();
	}

}
