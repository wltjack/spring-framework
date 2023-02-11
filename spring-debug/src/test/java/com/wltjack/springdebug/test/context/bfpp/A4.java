package com.wltjack.springdebug.test.context.bfpp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanDefinitionRegistryPostProcessor + 手动注入
 *
 * @author wltjack
 * Created at 2023/1/24 16:02
 */
public class A4 implements BeanDefinitionRegistryPostProcessor {
	private static final Logger LOGGER = LogManager.getLogger(A4.class);

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		LOGGER.info("A4 > BeanDefinitionRegistryPostProcessor + 手动注入 - 父类方法重写postProcessBeanFactory() ");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		LOGGER.info("A4 > BeanDefinitionRegistryPostProcessor + 手动注入 - 子类方法重写postProcessBeanDefinitionRegistry() ");
	}
}
