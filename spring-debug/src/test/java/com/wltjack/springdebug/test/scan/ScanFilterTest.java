package com.wltjack.springdebug.test.scan;

import com.wltjack.springdebug.test.scan.config.ScanFilterTestConfig;
import com.wltjack.springdebug.test.scan.config.ScanTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * ScanFilterTest
 *
 * @author wltjack
 * Created at 2023/3/13 22:47
 */
public class ScanFilterTest {

	@Test
	public void scan1(){
		// org.springframework.context.annotation.ConfigurationClassPostProcessor.processConfigBeanDefinitions
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ScanFilterTestConfig.class);

		System.out.println("-------------------");
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
	}
}
