package com.wltjack.springdebug.test.lifecycle;

import com.wltjack.springdebug.test.lifecycle.bean.ABean;
import com.wltjack.springdebug.test.lifecycle.config.LifeCycleTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * LifeCycleTest
 *
 * @author wltjack
 * Created at 2023/1/26 20:19
 */
public class LifeCycleTest {

	@Test
	public void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleTestConfig.class);

		ABean a = context.getBean(ABean.class);
		a.m0();
	}

}
