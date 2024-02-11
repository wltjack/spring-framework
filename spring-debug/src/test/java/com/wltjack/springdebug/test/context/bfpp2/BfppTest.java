package com.wltjack.springdebug.test.context.bfpp2;

import com.wltjack.springdebug.test.context.bfpp2.config.BfppTestConfig;
import com.wltjack.springdebug.test.context.bfpp2.service.BeanPostProcessorService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * BfppTest
 *
 * @author wltjack
 * Created at 2023/6/9 16:51
 */
public class BfppTest {
	private static final Logger LOGGER = LogManager.getLogger(BfppTest.class);

	@Test
	public void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BfppTestConfig.class);
		context.refresh();

		TestBeanFactoryPostProcessor bean = context.getBean(TestBeanFactoryPostProcessor.class);
		BeanPostProcessorService beanPostProcessorService = bean.getBeanPostProcessorService();
		LOGGER.info("beanPostProcessorService = {}", beanPostProcessorService);
	}

}
