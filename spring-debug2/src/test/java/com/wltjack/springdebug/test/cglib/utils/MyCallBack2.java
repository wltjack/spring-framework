package com.wltjack.springdebug.test.cglib.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * MyCallBack2
 *
 * @author wltjack
 * Created at 2023/6/1 22:02
 */
public class MyCallBack2 implements MethodInterceptor {
	private static final Logger LOGGER = LogManager.getLogger(MyCallBack2.class);

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		if (method.getName().equals("m0")) {
			LOGGER.info("m0相当于加了@Bean （2）");
		} else if (method.getName().equals("m1")) {
			LOGGER.info("m1相当于加了@Bean （2）");
		} else {
			methodProxy.invokeSuper(o, objects);
		}
		return null;
	}
}
