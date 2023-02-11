package com.wltjack.springdebug.mybatis.simulate4;

import org.apache.ibatis.annotations.Select;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 模拟SqlSession
 *
 * @author wltjack
 * Created at 2023/1/1 16:52
 */
public class MySqlSession {
	private static final Logger LOGGER = LogManager.getLogger(MySqlSession.class);

	/**
	 * jdk动态代理返回mapper实现对象
	 *
	 * @param clazz Class
	 * @return
	 */
	public static <T> T getMapper(Class<T> clazz) {
		ClassLoader classLoader = MySqlSession.class.getClassLoader();
		Class[] classes = new Class[]{clazz};

		// 通过jdk动态代理返回符合要求的对象
		return (T) Proxy.newProxyInstance(classLoader, classes, new MyTestInvocationHandler());
	}

	static class MyTestInvocationHandler implements InvocationHandler {

		/**
		 * 获取当前执行的方法对应的sql语句，
		 * 执行这些sql语句
		 */
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			// 处理toString()、hashCode()等Object类的方法
			if (method.getDeclaringClass().equals(Object.class)) {
				method.invoke(this, args);
			}
			// 获取Select注解
			Select selectAnnotation = method.getAnnotation(Select.class);
			String sql = selectAnnotation.value()[0];

			LOGGER.info("假装已经连接数据库。。。");
			LOGGER.info("假装执行查询 execute sql：{}", sql);
			LOGGER.info("假装根据类型返回了真实对象。。。");
			return null;
		}
	}
}
