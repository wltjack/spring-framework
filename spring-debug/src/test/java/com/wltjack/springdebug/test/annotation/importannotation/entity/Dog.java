package com.wltjack.springdebug.test.annotation.importannotation.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * Dog
 *
 * @author wltjack
 * Created at 2022/4/4 17:15
 * @since V1.0
 */
public class Dog implements BeanFactoryAware, ApplicationContextAware, EnvironmentAware, FactoryBean<Dog> {

	private Long id;

	private String name;

	private String code;

	private BeanFactory beanFactory;

	private Environment environment;

	private ApplicationContext applicationContext;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public void setBeanFactory(BeanFactory beanFactory) {
		this.beanFactory = beanFactory;
	}

	public Environment getEnvironment() {
		return environment;
	}

	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	@Override
	public Dog getObject() throws Exception {
		// new
		Dog dog1 = new Dog();
		// 反射
		Dog dog = Dog.class.getDeclaredConstructor().newInstance();
		// 动态代理
		Enhancer enhancer = new Enhancer();
		return dog;
	}

	@Override
	public Class<?> getObjectType() {
		return Dog.class;
	}
}
