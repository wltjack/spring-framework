package com.wltjack.springdebug.mybatis.simulate3.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 自定义的ImportBeanDefinitionRegistrar
 *
 * @author wltjack
 * Created at 2023/1/2 17:02
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	private static final Logger LOGGER = LogManager.getLogger(MyImportBeanDefinitionRegistrar.class);

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
										BeanDefinitionRegistry registry) {

		LOGGER.info("-------- MyImportBeanDefinitionRegistrar.registerBeanDefinitions() ---------");

		BeanDefinitionBuilder beanDefinitionBuilder =
				BeanDefinitionBuilder.genericBeanDefinition(MyFactoryBean.class);

		registry.registerBeanDefinition("myFactoryBean", beanDefinitionBuilder.getBeanDefinition());
	}

}
