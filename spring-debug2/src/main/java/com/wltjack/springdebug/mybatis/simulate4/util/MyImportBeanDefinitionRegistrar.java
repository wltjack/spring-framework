package com.wltjack.springdebug.mybatis.simulate4.util;

import com.wltjack.springdebug.mybatis.simulate4.dao.mapper.AccountMapper;
import com.wltjack.springdebug.mybatis.simulate4.dao.mapper.UserMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.LinkedHashMap;
import java.util.Map;

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
		Map<String, BeanDefinition> beanDefinitionMap = scan();
		for (Map.Entry<String, BeanDefinition> kv : beanDefinitionMap.entrySet()) {
			AbstractBeanDefinition mapperBd = (AbstractBeanDefinition) kv.getValue();
			Class<?> mapperClazz = mapperBd.getBeanClass();
			LOGGER.debug("before: {}", mapperBd.getBeanClass().getName());

			mapperBd.setBeanClass(MyFactoryBean.class);
			LOGGER.debug("after: {}", mapperBd.getBeanClass().getName());
			mapperBd.getPropertyValues().add("mapperInterface", mapperClazz.getName());
			registry.registerBeanDefinition(kv.getKey(), mapperBd);
		}

		BeanDefinitionBuilder beanDefinitionBuilder =
				BeanDefinitionBuilder.genericBeanDefinition(MyFactoryBean.class);

		registry.registerBeanDefinition("myFactoryBean", beanDefinitionBuilder.getBeanDefinition());
	}

	public Map<String, BeanDefinition> scan() {
		Map<String, BeanDefinition> beanDefinitionMap = new LinkedHashMap<>();
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(UserMapper.class);
		beanDefinitionMap.put("userMapper", builder.getBeanDefinition());

		builder = BeanDefinitionBuilder.genericBeanDefinition(AccountMapper.class);
		beanDefinitionMap.put("accountMapper", builder.getBeanDefinition());
		return beanDefinitionMap;
	}

}
