package com.wltjack.springdebug.test.context;

import com.wltjack.springdebug.test.context.bean.ABean;
import com.wltjack.springdebug.test.context.config.ContextTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 事件测试
 *
 * @author wltjack
 * Created at 2023/1/20 19:46
 */
public class EventTest {

	@Test
	public void test() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ContextTestConfig.class);
		ABean aBean = context.getBean(ABean.class);
		System.out.println(aBean);
	}
}
