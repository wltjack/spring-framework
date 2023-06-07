package com.wltjack.springdebug.test.scan2.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;


/**
 * M 讲道理是一个半配置类
 * 不管是full还是litespring都会把他当成配置类
 * 配置类----bean来处理
 * <p>
 * 从M的表现形式是一个lite但是spring不会解析他
 * 因为spring没有发觉他的存在
 */
public class M {
	private static final Logger LOGGER = LogManager.getLogger(M.class);

	public M() {
		LOGGER.info("create m");
	}


	@Bean
	public N n() {
		return new N();
	}
}
