package com.wltjack.springdebug.test.scan.util;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

/**
 * MyBeanNameGenerator
 *
 * @author wltjack
 * Created at 2023/3/7 22:50
 */
public class MyBeanNameGenerator implements BeanNameGenerator {

	@Override
	public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
		String beanClassName = definition.getBeanClassName();
		return beanClassName + "------name";
	}
}
