package com.wltjack.springdebug.test.context.bfpp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanDefinitionRegistryPostProcessor + @Component注解 + 手动注入其他对象BD
 *
 * @author wltjack
 * Created at 2023/1/24 16:02
 */
@Component
public class A5 implements BeanDefinitionRegistryPostProcessor {
	private static final Logger LOGGER = LogManager.getLogger(A5.class);

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		LOGGER.info("A5 > BeanDefinitionRegistryPostProcessor + @Component注解 + 手动注入其他对象BD - 父类方法重写postProcessBeanFactory() ");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		LOGGER.info("A5 > BeanDefinitionRegistryPostProcessor + @Component注解 + 手动注入其他对象BD - 子类方法重写postProcessBeanDefinitionRegistry() ");

		BeanDefinitionBuilder b1 = BeanDefinitionBuilder.genericBeanDefinition(B1.class);
		BeanDefinitionBuilder c1 = BeanDefinitionBuilder.genericBeanDefinition(C1.class);
		registry.registerBeanDefinition("b1", b1.getBeanDefinition());
		registry.registerBeanDefinition("c1", c1.getBeanDefinition());

	}
}
