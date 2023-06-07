package com.wltjack.springdebug.test.scan2.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;


public class K implements ImportBeanDefinitionRegistrar {
	private static final Logger LOGGER = LogManager.getLogger(K.class);

	public K() {
		LOGGER.info("k  K虽然会被实例化但是不会存在单例池当中");
	}

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
		LOGGER.info("ImportBeanDefinitionRegistrar#registerBeanDefinitions");
	}
}
