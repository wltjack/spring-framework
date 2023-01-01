package com.wltjack.springdebug.test.innerclass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 内部类测试
 *
 * @author kangliang
 * Created at 2022/11/27 15:11
 */
public class InnerClassTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(H.class);
		context.register(H.J.class);
		context.refresh();

		context.getBean(H.J.class);

	}
}
