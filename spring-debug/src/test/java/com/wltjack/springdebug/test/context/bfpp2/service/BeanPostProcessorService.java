package com.wltjack.springdebug.test.context.bfpp2.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


/**
 * BeanPostProcessorService
 *
 * @author wltjack
 * Created at 2023/6/9 16:46
 */
@Service("beanPostProcessorService")
public class BeanPostProcessorService {
	private static final Logger LOGGER = LogManager.getLogger(BeanPostProcessorService.class);

	private String str;

	private Integer i;

	public BeanPostProcessorService(){
		LOGGER.info("BeanPostProcessorService() > BeanPostProcessorService create ");
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Integer getI() {
		return i;
	}

	public void setI(Integer i) {
		this.i = i;
	}

	public void testAop(){
		LOGGER.info(" testAop() ");
	}


}
