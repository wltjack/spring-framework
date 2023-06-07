package com.wltjack.springdebug.test.cglib.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * MyChildClassCallBack
 *
 * @author wltjack
 * Created at 2023/6/1 22:02
 */
public class MyChildClassCallBack implements MethodInterceptor {
	private static final Logger LOGGER = LogManager.getLogger(MyChildClassCallBack.class);

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		LOGGER.info("do 自定义逻辑， 在执行父类的逻辑");
		return methodProxy.invokeSuper(o, objects);
	}
}
