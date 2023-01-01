package com.wltjack.springdebug.test.injectmodel.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;

/**
 * 模型bfpp
 *
 * @author kangliang
 * Created at 2022/11/27 18:08
 */
public class ModelBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	private static final Logger LOGGER = LogManager.getLogger(ModelBeanFactoryPostProcessor.class);

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) beanFactory.getBeanDefinition("a");

		LOGGER.info("mode:{}", beanDefinition.getAutowireMode());

		// 给A对象设置他的注入模型 = 3 AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR
//		beanDefinition.setAutowireMode(3);
		beanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);

	}
}
