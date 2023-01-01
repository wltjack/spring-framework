package com.wltjack.springdebug.test.di.staticfactory;

import com.wltjack.springdebug.di.staticfactory.entity.ABean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * DI测试
 *
 * @author wltjack
 * Created at 2022/4/7 22:38
 * @since v1.0
 */
public class DiTest {

	@Test
	void cycle() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("staticFactory.xml");
		ABean aBean = ctx.getBean(ABean.class);
		aBean.test();
	}
}
