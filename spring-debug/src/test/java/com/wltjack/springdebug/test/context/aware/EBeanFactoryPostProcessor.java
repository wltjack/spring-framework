package com.wltjack.springdebug.test.context.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * bfpp
 *
 * @author wltjack
 * Created at 2023/1/24 17:49
 */
@Component
public class EBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AbstractBeanDefinition eBean = (AbstractBeanDefinition)beanFactory.getBeanDefinition("eBean");
		eBean.setAutowireMode(2);

		AbstractBeanDefinition fBean = (AbstractBeanDefinition)beanFactory.getBeanDefinition("fBean");
		fBean.setAutowireMode(2);

		beanFactory.ignoreDependencyInterface(IAware.class);

//		// 所有类都会忽略
//		beanFactory.ignoreDependencyType(KBeanInterface.class);
	}
}
