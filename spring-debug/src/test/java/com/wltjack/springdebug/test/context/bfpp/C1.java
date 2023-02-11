package com.wltjack.springdebug.test.context.bfpp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * BeanDefinitionRegistryPostProcessor + 被动注入
 *
 * @author wltjack
 * Created at 2023/1/24 16:08
 */
public class C1 implements BeanDefinitionRegistryPostProcessor {
	private static final Logger LOGGER = LogManager.getLogger(C1.class);

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		LOGGER.info("C1 > BeanDefinitionRegistryPostProcessor + 被动注入 - 父类方法重写postProcessBeanFactory() ");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		LOGGER.info("C1 > BeanDefinitionRegistryPostProcessor + 被动注入  - 子类方法重写postProcessBeanDefinitionRegistry() ");
	}
}
