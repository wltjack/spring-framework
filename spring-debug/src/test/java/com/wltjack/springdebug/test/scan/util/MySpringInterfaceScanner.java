package com.wltjack.springdebug.test.scan.util;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.TypeFilter;

/**
 * MySpringInterfaceScanner
 *
 * @author wltjack
 * Created at 2023/4/8 20:58
 */
public class MySpringInterfaceScanner extends ClassPathBeanDefinitionScanner {

	public MySpringInterfaceScanner(BeanDefinitionRegistry registry) {
		super(registry);
	}

	@Override
	protected void registerDefaultFilters() {
		addIncludeFilter(new InterFaceFilter(false, true));
	}

	@Override
	public void addIncludeFilter(TypeFilter includeFilter) {
		super.addIncludeFilter(includeFilter);
	}
}
