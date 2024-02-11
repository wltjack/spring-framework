package com.wltjack.springdebug.test.context.bfpp2;

import com.wltjack.springdebug.test.context.bfpp2.service.BeanPostProcessorService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor, InitializingBean {
	private static final Logger LOGGER = LogManager.getLogger(TestBeanFactoryPostProcessor.class);

	@Autowired
	BeanPostProcessorService beanPostProcessorService;

	public BeanPostProcessorService getBeanPostProcessorService() {
		return beanPostProcessorService;
	}

	@PostConstruct
	public void postConstruct() {
		LOGGER.info("postConstruct() init");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		LOGGER.info("afterPropertiesSet() init");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		LOGGER.info("postProcessBeanFactory() > beanPostProcessorService = " + beanPostProcessorService);
	}
}
