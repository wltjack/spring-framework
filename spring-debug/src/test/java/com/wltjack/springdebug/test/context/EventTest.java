package com.wltjack.springdebug.test.context;

import com.wltjack.springdebug.test.context.bean.ABean;
import com.wltjack.springdebug.test.context.config.ContextTestConfig;
import com.wltjack.springdebug.test.context.event.AsyncSendEmailEvent;
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

	@Test
	public void test2() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ContextTestConfig.class);

		AsyncSendEmailEvent asyncSendEmailEvent = new AsyncSendEmailEvent(new Object());
		asyncSendEmailEvent.setSubject("test");
		asyncSendEmailEvent.setEmail("aa@163.com");
		asyncSendEmailEvent.setContent("aaa");
		asyncSendEmailEvent.setTargetUserId("1");
		context.publishEvent(asyncSendEmailEvent);
	}
}
