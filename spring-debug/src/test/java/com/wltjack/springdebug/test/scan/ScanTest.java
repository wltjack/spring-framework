package com.wltjack.springdebug.test.scan;

import com.wltjack.springdebug.test.scan.config.ScanTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * ScanTest
 *
 * @author wltjack
 * Created at 2023/3/7 21:24
 */
public class ScanTest {

	@Test
	public void scan1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.wltjack.springdebug.test.scan.bean");

		context.refresh();

		System.out.println("-------------------");
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
	}

	@Test
	public void scan2() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ScanTestConfig.class);

		System.out.println("-------------------");
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
	}

	@Test
	public void scan3() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext("com.wltjack.springdebug.test.scan.bean");

		System.out.println("-------------------");
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
	}

}
