package com.wltjack.springdebug.test.context.bfpp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanDefinitionRegistryPostProcessor + @Component注解
 *
 * @author wltjack
 * Created at 2023/1/24 16:02
 */
@Component
public class A3 implements BeanDefinitionRegistryPostProcessor {
	private static final Logger LOGGER = LogManager.getLogger(A3.class);

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		LOGGER.info("A3 > BeanDefinitionRegistryPostProcessor + @Component注解 - 父类方法重写postProcessBeanFactory() ");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		LOGGER.info("A3 > BeanDefinitionRegistryPostProcessor + @Component注解 - 子类方法重写postProcessBeanDefinitionRegistry() ");
	}
}
