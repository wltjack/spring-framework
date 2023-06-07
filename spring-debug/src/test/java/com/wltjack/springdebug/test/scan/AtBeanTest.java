package com.wltjack.springdebug.test.scan;

import com.wltjack.springdebug.test.scan.config.AtBeanScanTestConfig;
import com.wltjack.springdebug.test.scan.config.ScanTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @Bean 测试
 *
 * @author wltjack
 * Created at 2023/6/2 15:11
 */
public class AtBeanTest {

	@Test
	public void scan() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AtBeanScanTestConfig.class);

		System.out.println("-------------------");
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
	}
}
