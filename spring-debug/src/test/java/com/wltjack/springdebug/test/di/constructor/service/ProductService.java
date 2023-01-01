package com.wltjack.springdebug.test.di.constructor.service;

import com.wltjack.springdebug.test.di.autowired.service.OrderService;
import org.springframework.stereotype.Component;

/**
 * ProductService
 * <p></p>
 * 推导构造函数测试
 *
 * @author wltjack
 * Created at 2022/5/7 23:32
 */
@Component
public class ProductService {

	private OrderService orderService;

	public ProductService() {
		System.out.println("构造函数 -》0");
	}

	public ProductService(OrderService orderService) {
		this.orderService = orderService;
		System.out.println("构造函数 -》1");
	}

//	public ProductService(OrderService orderService, OrderService orderService2) {
//		this.orderService = orderService;
//		System.out.println("构造函数 -》2");
//	}

	public void test() {
		System.out.println("test()");
	}

}
