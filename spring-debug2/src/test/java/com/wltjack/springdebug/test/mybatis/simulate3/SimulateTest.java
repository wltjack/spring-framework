package com.wltjack.springdebug.test.mybatis.simulate3;

import com.wltjack.springdebug.mybatis.simulate3.config.MyBatisTestConfig4;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 模拟mybatis测试
 *
 * @author wltjack
 * Created at 2023/1/2 16:58
 */
public class SimulateTest {

	/**
	 * 测试ImportBeanDefinitionRegistrar
	 */
	@Test
	public void importBeanDefinitionRegistrarTest() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MyBatisTestConfig4.class);

		Object bean = context.getBean("&myFactoryBean");
		System.out.println(bean);
	}
}
