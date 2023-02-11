package com.wltjack.springdebug.test.context.bfpp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * BeanFactoryPostProcessor + 被动注入
 *
 * @author wltjack
 * Created at 2023/1/24 16:08
 */
public class B1 implements BeanFactoryPostProcessor {
	private static final Logger LOGGER = LogManager.getLogger(B1.class);

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		LOGGER.info("B1 > BeanFactoryPostProcessor + 被动注入 ");
	}
}
