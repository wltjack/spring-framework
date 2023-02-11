package com.wltjack.springdebug.mybatis.simulate4.util;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * mapper扫描注解
 *
 * @author wltjack
 * Created at 2023/1/19 20:47
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface MyMapperScan {
}
