package com.wltjack.springdebug.test.lifecycle.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * LifeCycleTestConfig
 *
 * @author wltjack
 * Created at 2023/1/26 20:09
 */
@Configuration
@ComponentScan("com.wltjack.springdebug.test.lifecycle")
@EnableAspectJAutoProxy
public class LifeCycleTestConfig {
	private static final Logger LOGGER = LogManager.getLogger(LifeCycleTestConfig.class);

	@Bean(initMethod = "onInit", destroyMethod = "onDestroy")
	public LifeCycleTestConfig mySpringBean() {
		return new LifeCycleTestConfig();
	}

	public void onInit() {
		LOGGER.info("@Bean > initMethod属性对应的方法");
	}

	public void onDestroy(){
		LOGGER.info("@Bean > destroyMethod属性对应的方法");
	}

}
