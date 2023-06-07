package com.wltjack.springdebug.test.scan.config;

import com.wltjack.springdebug.test.scan.bean.C;
import com.wltjack.springdebug.test.scan.bean.D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ScanTestConfig
 *
 * @author wltjack
 * Created at 2023/3/7 21:27
 */
@Configuration
@ComponentScan(value = "com.wltjack.springdebug.test.scan")
public class AtBeanScanTestConfig {

	@Bean
	public C c() {
		return new C();
	}

	@Bean
	public D d() {
		c();
		return new D();
	}

}
