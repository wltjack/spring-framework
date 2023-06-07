package com.wltjack.springdebug.test.scan;

import com.wltjack.springdebug.test.scan.config.ScanTestConfig2;
import com.wltjack.springdebug.test.scan.util.MyBeanNameGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * BeanNameGeneratorTest
 *
 * @author wltjack
 * Created at 2023/3/7 22:49
 */
public class BeanNameGeneratorTest {

	@Test
	public void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.wltjack.springdebug.test.scan.bean");

		context.setBeanNameGenerator(new MyBeanNameGenerator());
		context.refresh();

		System.out.println("-------------------");
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
	}

	@Test
	public void test2() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.setBeanNameGenerator(new MyBeanNameGenerator());
		context.scan("com.wltjack.springdebug.test.scan.bean");
		context.refresh();

		System.out.println("-------------------");
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
	}

	@Test
	public void test3(){
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ScanTestConfig2.class);

		System.out.println("-------------------");
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
	}
}
