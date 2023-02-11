package com.wltjack.springdebug.mybatis.simulate.config;

import com.wltjack.springdebug.mybatis.simulate.MySqlSession;
import com.wltjack.springdebug.mybatis.simulate.dao.mapper.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * MyBatisTestConfig
 *
 * @author wltjack
 * Created at 2023/1/1 18:51
 */
@ComponentScan("com.wltjack.springdebug.mybatis.simulate")
public class MyBatisTestConfig {

//	@Bean
//	public DataSource dataSource(){
//		DriverManagerDataSource driverManagerDataSource
//				= new DriverManagerDataSource();
//		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		driverManagerDataSource.setPassword("123456");
//		driverManagerDataSource.setUsername("root");
//		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/mybatis_test?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC");
//		return driverManagerDataSource;
//	}
//
//	@Bean
//	public SqlSessionFactory sqlSessionFactory() throws Exception {
//		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//		factoryBean.setDataSource(dataSource());
//		return factoryBean.getObject();
//	}

	@Bean
	public UserMapper userMapper() {
		UserMapper mapper = MySqlSession.getMapper(UserMapper.class);
		return mapper;
	}

}
