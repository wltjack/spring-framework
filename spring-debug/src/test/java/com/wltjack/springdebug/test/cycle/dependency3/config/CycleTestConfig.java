package com.wltjack.springdebug.test.cycle.dependency3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;






/**
 * CycleTestConfig
 *
 * @author wltjack
 * Created at 2023/2/19 16:54
 */
@Configuration
@ComponentScan("com.wltjack.springdebug.test.cycle.dependency3")
@EnableAspectJAutoProxy
public class CycleTestConfig {
}
