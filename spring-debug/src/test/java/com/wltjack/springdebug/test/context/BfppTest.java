package com.wltjack.springdebug.test.context;

import com.wltjack.springdebug.test.context.bfpp.A2;
import com.wltjack.springdebug.test.context.bfpp.A4;
import com.wltjack.springdebug.test.context.bfpp.B1;
import com.wltjack.springdebug.test.context.config.BfppTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * bfpp测试
 *
 * @author wltjack
 * Created at 2023/1/24 16:54
 */
public class BfppTest {


	@Test
	public void test() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.addBeanFactoryPostProcessor(new A2());
		context.addBeanFactoryPostProcessor(new A4());
		context.register(BfppTestConfig.class);
		context.refresh();
		System.out.println(context.getBean(B1.class));
	}

}
