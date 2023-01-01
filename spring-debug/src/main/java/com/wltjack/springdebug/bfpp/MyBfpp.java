package com.wltjack.springdebug.bfpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 自定义的BFPP
 *
 * @author wltjack
 * Created at 2022/4/20 23:11
 * @since V1.0
 */
public class MyBfpp implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition person = beanFactory.getBeanDefinition("person");
		person.setAttribute("id", 100);
		System.out.println(person.getConstructorArgumentValues());
		System.out.println("MyBfpp >>> postProcessBeanFactory()");
	}
}
