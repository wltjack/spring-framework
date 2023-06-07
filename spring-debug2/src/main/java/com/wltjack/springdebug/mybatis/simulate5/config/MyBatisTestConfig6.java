package com.wltjack.springdebug.mybatis.simulate5.config;

import com.wltjack.springdebug.mybatis.simulate5.util.MyMapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatisTestConfig
 *
 * @author wltjack
 * Created at 2023/1/1 18:51
 */
@Configuration
@ComponentScan("com.wltjack.springdebug.mybatis.simulate5")
@MyMapperScan(value = "com.wltjack.springdebug.mybatis.simulate5.dao.mapper")
public class MyBatisTestConfig6 {

}
