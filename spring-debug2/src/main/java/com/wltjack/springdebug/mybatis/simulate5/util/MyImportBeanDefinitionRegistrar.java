package com.wltjack.springdebug.mybatis.simulate5.util;

import com.wltjack.springdebug.mybatis.simulate5.dao.mapper.AccountMapper;
import com.wltjack.springdebug.mybatis.simulate5.dao.mapper.UserMapper;
import com.wltjack.springdebug.spring.scan.util.MyScaner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * 自定义的ImportBeanDefinitionRegistrar
 *
 * @author wltjack
 * Created at 2023/1/2 17:02
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	private static final Logger LOGGER = LogManager.getLogger(MyImportBeanDefinitionRegistrar.class);

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
										BeanDefinitionRegistry registry) {

		LOGGER.info("-------- MyImportBeanDefinitionRegistrar.registerBeanDefinitions() ---------");
		Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(MyMapperScan.class.getName());
		Set<BeanDefinitionHolder> beanDefinitionHolders = scan(importingClassMetadata, registry, annotationAttributes);
		for (BeanDefinitionHolder beanDefinitionHolder : beanDefinitionHolders) {
			AbstractBeanDefinition mapperBd = (AbstractBeanDefinition) beanDefinitionHolder.getBeanDefinition();
			String beanClassName = mapperBd.getBeanClassName();
			mapperBd.setBeanClass(MyFactoryBean.class);
			mapperBd.getPropertyValues().add("mapperInterface", beanClassName);
		}

	}

	public Set<BeanDefinitionHolder> scan(AnnotationMetadata importingClassMetadata,
										  BeanDefinitionRegistry registry,
										  Map<String, Object> annotationAttributes) {
		String scanPackageName = (String) annotationAttributes.get("value");
		MyMapperScanner scanner = new MyMapperScanner(registry, true);
		return scanner.doScan(scanPackageName);
	}

}
