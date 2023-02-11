package com.wltjack.springdebug.test.lifecycle.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * MyBeanFactoryPostProcessor
 *
 * @author wltjack
 * Created at 2023/1/30 17:14
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AbstractBeanDefinition a = (AbstractBeanDefinition) beanFactory.getBeanDefinition("ABean");
		a.setAutowireMode(AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE);
	}
}
