package com.wltjack.springdebug.test.scan2.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@PropertySource("classpath:application.properties")
public class R {
	private static final Logger LOGGER = LogManager.getLogger(R.class);

	@Value("${k1}")
	String k1;

	@PostConstruct
	public void init(){
		LOGGER.info("k1:[{}]",k1);
	}
}
