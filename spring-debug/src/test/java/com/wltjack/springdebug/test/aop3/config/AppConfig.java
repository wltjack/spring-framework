package com.wltjack.springdebug.test.aop3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.wltjack.springdebug.test.aop3")
public class AppConfig {

}
