package com.wltjack.springdebug.spring.scan.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

import java.util.List;
import java.util.Map;

/**
 * MyScanBeanDefinitionRegistryPostProcessor
 *
 * @author wltjack
 * Created at 2023/3/5 22:18
 */
public class MyScanBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		try {
			MyScaner myScaner = new MyScaner();
			myScaner.scan("com.wltjack.springdebug.test.spring.scan.bean");

			List<String> nameList = myScaner.getNameList();
			Map<String, AbstractBeanDefinition> map = myScaner.getMap();

			for (String s : nameList) {
				registry.registerBeanDefinition(s, map.get(s));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
