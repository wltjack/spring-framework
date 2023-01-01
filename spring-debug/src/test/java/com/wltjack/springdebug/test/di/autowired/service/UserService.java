package com.wltjack.springdebug.test.di.autowired.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * UserService
 *
 * @author wltjack
 * Created at 2022/5/4 16:49
 */
@Component
public class UserService implements InitializingBean {
	@Autowired
	private OrderService orderService;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
	}

	public void test() {
		System.out.println("UserService -> test()");
	}
}
