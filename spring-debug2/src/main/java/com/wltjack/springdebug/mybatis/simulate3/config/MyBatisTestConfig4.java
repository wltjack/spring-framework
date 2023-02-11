package com.wltjack.springdebug.mybatis.simulate3.config;

import com.wltjack.springdebug.mybatis.simulate3.util.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * MyBatisTestConfig
 *
 * @author wltjack
 * Created at 2023/1/1 18:51
 */
//@ComponentScan("com.wltjack.springdebug.mybatis.simulate3")
@ComponentScan("com.wltjack.springdebug.mybatis.simulate3.util")
@Import(MyImportBeanDefinitionRegistrar.class)
public class MyBatisTestConfig4 {


}
