package com.wltjack.springdebug.test.di.order.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * ABeanFactoryPostProcessor
 *
 * @author kangliang
 * Created at 2022/12/18 18:27
 */
@Order(10)
@Component
public class ABeanFactoryPostProcessor extends E implements BeanFactoryPostProcessor, InitializingBean {
	private static final Logger LOGGER = LogManager.getLogger(ABeanFactoryPostProcessor.class);

	public ABeanFactoryPostProcessor() {
		LOGGER.info("ABeanFactoryPostProcessor的构造方法");
	}

	@PostConstruct
	public void initMethod() {
		LOGGER.info("initMethod()");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		Integer orderValue = null;
		if (this.getClass().isAnnotationPresent(Order.class)) {
			Order order = this.getClass().getAnnotation(Order.class);
			orderValue = order.value();
		}

		LOGGER.info("ABeanFactoryPostProcessor - postProcessBeanFactory(), orderValue = {}", orderValue);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		LOGGER.info("init初始化方法执行。");
	}
}
