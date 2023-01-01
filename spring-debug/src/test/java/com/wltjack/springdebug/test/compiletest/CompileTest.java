package com.wltjack.springdebug.test.compiletest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring源码编译测试
 *
 * @author kangliang
 * Created at 2022/11/13 17:17
 */
public class CompileTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeanA.class);
		context.refresh();
		System.out.println(context.getBean(BeanA.class));
	}
}
