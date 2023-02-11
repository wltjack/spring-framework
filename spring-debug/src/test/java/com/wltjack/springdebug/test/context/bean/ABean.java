package com.wltjack.springdebug.test.context.bean;

import com.wltjack.springdebug.test.context.event.ABeanInitEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * ABean
 *
 * @author wltjack
 * Created at 2023/1/20 19:35
 */
@Component
public class ABean implements InitializingBean {
	private static final Logger LOGGER = LogManager.getLogger(ABean.class);

	@Autowired
	private ApplicationContext applicationContext;

	public ABean() {
		LOGGER.info("default Construct");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		LOGGER.info("a init afterPropertiesSet");
	}

	@PostConstruct
	public void init() {
		LOGGER.info("a > init()");
		applicationContext.publishEvent(new ABeanInitEvent(applicationContext));
	}
}
