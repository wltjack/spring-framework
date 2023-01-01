package com.wltjack.springdebug.test.bd;

import com.wltjack.springdebug.test.bd.annotation.ATest;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 注解扫描器
 *
 * @author wltjack
 * Created at 2022/6/5 21:27
 */
public class AnnotationScanner {
	private static final String BASE_PACKAGE = "com.wltjack.springdebug";

	public static List<ADefinition> scan() {
		Set<BeanDefinition> beanDefinitions = scan(ATest.class, BASE_PACKAGE);
		List<ADefinition> aDefinitionList = new ArrayList<>();
		if (beanDefinitions != null) {
			for (BeanDefinition beanDefinition : beanDefinitions) {
				ScannedGenericBeanDefinition scannedGenericBeanDefinition = (ScannedGenericBeanDefinition) beanDefinition;
				AnnotationMetadata metadata = scannedGenericBeanDefinition.getMetadata();
				Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(ATest.class.getName());
				if (annotationAttributes == null) {
					continue;
				}
				ADefinition aDefinition = ADefinition.builder()
						.id((String) annotationAttributes.get("id"))
						.remark((String) annotationAttributes.get("remark"))
						.build();
				aDefinitionList.add(aDefinition);
			}
		}

		return aDefinitionList;
	}

	public static Set<BeanDefinition> scan(Class<? extends Annotation> annotationClass,
										   String basePackage) {
		ClassPathScanningCandidateComponentProvider provider =
				new ClassPathScanningCandidateComponentProvider(false);
		provider.addIncludeFilter(new AnnotationTypeFilter(annotationClass));
		return provider.findCandidateComponents(basePackage);
	}


}
