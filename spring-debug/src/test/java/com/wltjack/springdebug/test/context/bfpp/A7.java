package com.wltjack.springdebug.test.context.bfpp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * BeanDefinitionRegistryPostProcessor + PriorityOrdered + @Component
 *
 * @author wltjack
 * Created at 2023/1/24 16:46
 */
@Component
public class A7 implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {
	private static final Logger LOGGER = LogManager.getLogger(A7.class);

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		LOGGER.info("A7 > BeanFactoryPostProcessor + PriorityOrdered + @Component - 父类方法重写 postProcessBeanFactory()");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		LOGGER.info("A7 > BeanFactoryPostProcessor + PriorityOrdered + @Component - 子类方法重写 postProcessBeanDefinitionRegistry()");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
