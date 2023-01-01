package com.wltjack.springdebug.test.di.constructor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * AopConfig
 *
 * @author wltjack
 * Created at 2022/5/4 22:21
 */
@Configuration
@ComponentScan(value = {"com.wltjack.springdebug.test.di.autowired", "com.wltjack.springdebug.test.di.constructor"})
public class AopConfig {
}
