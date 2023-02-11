package com.wltjack.springdebug.mybatis.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * mybatis配置类
 *
 * @author wltjack
 * Created at 2023/1/1 12:46
 */
@ComponentScan("com.wltjack.springdebug.mybatis.demo")
@MapperScan("com.wltjack.springdebug.mybatis.demo.dao.mapper")
public class MybatisConfig {

	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource driverManagerDataSource
				= new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setPassword("123456");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/mybatis_test?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC");
		return driverManagerDataSource;
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource());
		return factoryBean.getObject();
	}

}
