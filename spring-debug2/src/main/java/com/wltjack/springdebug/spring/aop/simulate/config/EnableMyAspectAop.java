package com.wltjack.springdebug.spring.aop.simulate.config;

import com.wltjack.springdebug.spring.aop.simulate.util.MyJdkProxyBeanPostProcessor2;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * EnableMyAspectAop
 *
 * @author wltjack
 * Created at 2023/2/11 21:04
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(MyJdkProxyBeanPostProcessor2.class)
public @interface EnableMyAspectAop {

}
