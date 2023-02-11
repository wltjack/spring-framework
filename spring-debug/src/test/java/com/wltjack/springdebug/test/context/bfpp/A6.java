package com.wltjack.springdebug.test.context.bfpp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * BeanFactoryPostProcessor + PriorityOrdered + @Component
 *
 * @author wltjack
 * Created at 2023/1/24 16:35
 */
@Component
public class A6 implements BeanFactoryPostProcessor, PriorityOrdered {
	private static final Logger LOGGER = LogManager.getLogger(A6.class);

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		LOGGER.info("A6 > BeanFactoryPostProcessor + PriorityOrdered + @Component");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
