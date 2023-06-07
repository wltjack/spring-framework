package com.wltjack.springdebug.mybatis.simulate5.util;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.TypeFilter;

import java.util.Set;

/**
 * MyMapperScaner
 *
 * @author wltjack
 * Created at 2023/4/8 9:34
 */
public class MyMapperScanner extends ClassPathBeanDefinitionScanner {


	public MyMapperScanner(BeanDefinitionRegistry registry, boolean useDefaultFilters) {
		super(registry, useDefaultFilters);
	}

	@Override
	protected void registerDefaultFilters() {
		TypeFilter typeFilter = (metadataReader, metadataReaderFactory) -> true;
		super.addIncludeFilter(typeFilter);
	}

	@Override
	protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
		return beanDefinition.getMetadata().isInterface();
	}

	@Override
	protected Set<BeanDefinitionHolder> doScan(String... basePackages) {
		return super.doScan(basePackages);
	}

}
