package com.wltjack.springdebug.test.spring.scan;

import com.wltjack.springdebug.spring.scan.util.MyScanBeanDefinitionRegistryPostProcessor;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ScanTest
 *
 * @author wltjack
 * Created at 2023/3/5 21:51
 */
public class ScanTest {

	@Test
	public void defaultScan() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.addBeanFactoryPostProcessor(new MyScanBeanDefinitionRegistryPostProcessor());
		context.refresh();

	}
}
