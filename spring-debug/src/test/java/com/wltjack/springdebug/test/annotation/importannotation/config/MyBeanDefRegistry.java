package com.wltjack.springdebug.test.annotation.importannotation.config;

import com.wltjack.springdebug.test.annotation.importannotation.entity.Order;
import com.wltjack.springdebug.test.annotation.importannotation.entity.User;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * MyBeanDefRegistry
 *
 * @author wltjack
 * Created at 2022/7/3 22:30
 */
public class MyBeanDefRegistry implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(User.class);
		registry.registerBeanDefinition("user", rootBeanDefinition);
		rootBeanDefinition = new RootBeanDefinition(Order.class);
		registry.registerBeanDefinition("order", rootBeanDefinition);
	}

}
