package com.wltjack.springdebug.test.beandefinition;

import com.wltjack.springdebug.test.beandefinition.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * BeanDefinition测试
 *
 * @author wltjack
 * Created at 2022/5/20 23:12
 */
public class BeanDefinitionTest {

	@Test
	void beanDefinition() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(User.class);
//		beanDefinition.getPropertyValues().addPropertyValue("userName", "李白");
		beanDefinition.getPropertyValues().add("userName", "李白");
		context.registerBeanDefinition("yy", beanDefinition);

		context.refresh();

		System.out.println(context.getBean("yy"));
	}
}
