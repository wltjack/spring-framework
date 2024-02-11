package com.wltjack.springdebug.test.introspect.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("a")
public class SpringFieldInjectDemoTestBean {
	private static final Logger LOGGER = LogManager.getLogger(SpringFieldInjectDemoTestBean.class);

	@Autowired
	AnnotationAutowiredFieldBean annotationAutowiredFieldBean;

	@Autowired
	public void setAnnotationAutowiredMethodBean(AnnotationAutowiredMethodBean annotationAutowiredMethodBean) {
		LOGGER.info("1、autowired method > setAnnotationAutowiredMethodBean({})", annotationAutowiredMethodBean);
	}

	public void setAutowiredInjectByTypeMethodBean(AutowiredInjectByTypeMethodBean autowiredInjectByTypeMethodBean) {
		LOGGER.info("2、autowired byType > setAutowiredInjectByTypeMethodBean({})", autowiredInjectByTypeMethodBean);
	}

	public void printf() {
		LOGGER.info("3、printf() > annotationAutowiredFieldBean=[{}]", annotationAutowiredFieldBean);
	}

}
