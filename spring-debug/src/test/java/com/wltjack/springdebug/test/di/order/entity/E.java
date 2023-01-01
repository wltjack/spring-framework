package com.wltjack.springdebug.test.di.order.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.annotation.Order;

/**
 * E
 *
 * @author wltjack
 * Created at 2022/12/18 18:26
 */
public class E {
	private static final Logger LOGGER = LogManager.getLogger(E.class);

	public void printOrder() {
		Integer orderValue = null;
		if (this.getClass().isAnnotationPresent(Order.class)) {
			Order order = this.getClass().getAnnotation(Order.class);
			orderValue = order.value();
		}
		LOGGER.info("className = {}, orderValue = {}", this.getClass().getSimpleName(), orderValue);
	}
}
