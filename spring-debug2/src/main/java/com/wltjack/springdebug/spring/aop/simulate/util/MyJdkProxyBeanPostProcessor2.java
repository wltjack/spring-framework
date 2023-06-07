package com.wltjack.springdebug.spring.aop.simulate.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * aop jdk动态代理模拟
 *
 * @author wltjack
 * Created at 2023/2/1 22:16
 */
//@Component
public class MyJdkProxyBeanPostProcessor2 implements BeanPostProcessor {
	private static final Logger LOGGER = LogManager.getLogger(MyJdkProxyBeanPostProcessor2.class);

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("d1".equals(beanName)) {
			ClassLoader classLoader = this.getClass().getClassLoader();
			Class<?>[] interfaces = bean.getClass().getInterfaces();
			Object proxy = Proxy.newProxyInstance(classLoader, interfaces, new MyInvocationHandler(bean));
			return proxy;
		}
		return null;
	}

	public static class MyInvocationHandler implements InvocationHandler {

		private Object target;

		public MyInvocationHandler(Object target) {
			this.target = target;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			LOGGER.info("aop before...");
			Object result = method.invoke(target, args);
			LOGGER.info("aop after...");
			return result;
		}
	}
}
