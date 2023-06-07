package com.wltjack.springdebug.test.lifecycle.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * ABean
 *
 * @author wltjack
 * Created at 2023/1/26 19:48
 */
@Component
public class ABean implements BeanNameAware, ApplicationContextAware, InitializingBean, SmartInitializingSingleton {
	private static final Logger LOGGER = LogManager.getLogger(ABean.class);

	@Autowired
	private BBean bBean;

	private CBean cBean;

	public void setcBean(CBean cBean) {
		LOGGER.info("3> byType wired: [{}]", cBean);
		this.cBean = cBean;
	}

	public ABean() {
		LOGGER.info("1> ABean default Constructor");
	}


	public void m0() {
		LOGGER.info("ABean m0()");
	}

	@PostConstruct
	public void init() {
		LOGGER.info("6> ABean init() >> @PostConstruct方法");
	}

	@PreDestroy
	public void preDestroy() {
		LOGGER.info("9> ABean preDestroy() >> @PreDestroy方法");

	}

	@Override
	public void setBeanName(String name) {
		LOGGER.info("4> ABean setBeanName: [{}]", name);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		LOGGER.info("7> ABean afterPropertiesSet()");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		LOGGER.info("5> ABean setApplicationContext: [{}]", applicationContext);
	}

	@Override
	public void afterSingletonsInstantiated() {
		LOGGER.info("8> ABean afterSingletonsInstantiated()");
	}
}
