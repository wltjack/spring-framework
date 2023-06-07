package com.wltjack.springdebug.test.scan2;

import com.wltjack.springdebug.test.scan2.config.AppConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * ScanTest
 *
 * @author wltjack
 * Created at 2023/6/5 21:45
 */
public class ScanTest {
	private static final Logger LOGGER = LogManager.getLogger(ScanTest.class);

	@Test
	public void scan1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
//		ConfigurableEnvironment environment = context.getEnvironment();
//		ResourcePropertySource rps = new ResourcePropertySource("classpath:application.properties");
//		environment.getPropertySources().addLast(rps);
		context.refresh();
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		LOGGER.info("beanDefinitionNames = {}", Arrays.stream(beanDefinitionNames).collect(Collectors.toList()));
	}

	@Test
	public void testProperties() throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().getPropertySources().addLast(new ResourcePropertySource("classpath:application.properties"));
		String k1 = context.getEnvironment().getProperty("k1");
		LOGGER.info("k1:[{}]", k1);
	}

}
