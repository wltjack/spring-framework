package com.wltjack.springdebug.test.context;

import com.wltjack.springdebug.test.context.aware.EBean;
import com.wltjack.springdebug.test.context.aware.FBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * aware测试
 *
 * @author wltjack
 * Created at 2023/1/24 18:31
 */
public class AwareTest {

	@Test
	public void test() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext();
		context.scan("com.wltjack.springdebug.test.context.aware");
		context.refresh();
		System.out.println(context.getBean(EBean.class).getK());
		System.out.println(context.getBean(FBean.class).getK());
	}

}
