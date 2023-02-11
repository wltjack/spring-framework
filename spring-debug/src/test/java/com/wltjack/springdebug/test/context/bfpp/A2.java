package com.wltjack.springdebug.test.context.bfpp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * BeanFactoryPostProcessor + 手动注入
 *
 * @author wltjack
 * Created at 2023/1/24 15:53
 */
public class A2 implements BeanFactoryPostProcessor {
	private static final Logger LOGGER = LogManager.getLogger(A2.class);

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		LOGGER.info("A2 > BeanFactoryPostProcessor + 手动注入 ");
	}

}
