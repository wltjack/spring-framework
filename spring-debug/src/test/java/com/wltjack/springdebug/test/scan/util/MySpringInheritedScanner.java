package com.wltjack.springdebug.test.scan.util;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.TypeFilter;

/**
 * MySpringInheritedScanner
 *
 * @author wltjack
 * Created at 2023/4/8 20:58
 */
public class MySpringInheritedScanner extends ClassPathBeanDefinitionScanner {

	public MySpringInheritedScanner(BeanDefinitionRegistry registry) {
		super(registry);
	}

	@Override
	protected void registerDefaultFilters() {
		addIncludeFilter(new InheritedFilter(true, true));
	}

	@Override
	public void addIncludeFilter(TypeFilter includeFilter) {
		super.addIncludeFilter(includeFilter);
	}
}
