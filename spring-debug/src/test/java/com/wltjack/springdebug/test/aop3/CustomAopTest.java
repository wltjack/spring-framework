package com.wltjack.springdebug.test.aop3;

import com.wltjack.springdebug.test.aop3.advice.MyBeforeAdvice;
import com.wltjack.springdebug.test.aop3.service.AopTestService;
import com.wltjack.springdebug.test.aop3.service.impl.AAopTestServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.ProxyFactory;

/**
 * CustomAopTest
 *
 * @author wltjack
 * Created at 2023/6/8 21:55
 */
public class CustomAopTest {

	@Test
	void test1(){
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setInterfaces(AopTestService.class);
		proxyFactory.addAdvice(new MyBeforeAdvice());

		proxyFactory.setTarget(new AAopTestServiceImpl());
		AopTestService service = (AopTestService)proxyFactory.getProxy();
		service.m();
	}
}
