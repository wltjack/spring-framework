package com.wltjack.springdebug.test.di.supplier;

import com.wltjack.springdebug.di.supplier.entity.A1;
import com.wltjack.springdebug.di.supplier.entity.ObjectFactory;
import com.wltjack.springdebug.test.di.supplier.config.SuppilerTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * suppiler测试
 *
 * @author wltjack
 * Created at 2022/12/31 21:01
 */
public class SuppilerTest {

	@Test
	public void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SuppilerTestConfig.class);
		context.refresh();
	}

	@Test
	public void test2() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ObjectFactory.class);

		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClass(A1.class);
		beanDefinition.setFactoryBeanName("objectFactory");
		beanDefinition.setFactoryMethodName("instanceObject");

		context.registerBeanDefinition("a1", beanDefinition);
		context.refresh();
	}

	@Test
	public void test3() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(ObjectFactory.class);
		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClass(A1.class);

		SupplierFactory supplierFactory = new SupplierFactory();
		beanDefinition.setInstanceSupplier(supplierFactory::instanceObject);
		context.registerBeanDefinition("a1", beanDefinition);
		context.refresh();
	}

	@Test
	public void test4() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

//		context.register(ObjectFactory.class);
		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClass(A1.class);

		beanDefinition.setInstanceSupplier(SupplierFactory::getObject);
		context.registerBeanDefinition("a1", beanDefinition);
		context.refresh();
	}


}
