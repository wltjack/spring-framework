package com.wltjack.springdebug.test.scan2.bean;

import org.springframework.context.annotation.Bean;

public interface I {

	@Bean
	public default S s(){
		return new S();
	}
}
