package com.wltjack.springdebug.test.di.autowired.service;

import org.springframework.stereotype.Component;

/**
 * OrderService
 *
 * @author wltjack
 * Created at 2022/5/4 16:51
 */
@Component
public class OrderService {

	public void test() {
		System.out.println("OrderService -> test()");
	}
}
