package com.wltjack.springdebug.test.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * ServiceAspect
 *
 * @author kangliang
 * Created at 2022/5/4 21:03
 */
@EnableAspectJAutoProxy
@Aspect
@Component
public class ServiceAspect {

	@Before("execution(public void com.wltjack.springdebug.test.aop.service.*Service.*())")
	public void serviceBefore(){
		System.out.println("aop test...");
	}
}
