package com.wltjack.springdebug.test.context.bfpp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * BeanFactoryPostProcessor + @Component注解
 *
 * @author wltjack
 * Created at 2023/1/24 15:53
 */
@Component
public class A1 implements BeanFactoryPostProcessor {
	private static final Logger LOGGER = LogManager.getLogger(A1.class);

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		LOGGER.info("A1 > BeanFactoryPostProcessor + @Component注解 ");
	}

}
