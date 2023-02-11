package com.wltjack.springdebug.test.lifecycle.config;

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


}
