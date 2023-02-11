package com.wltjack.springdebug.mybatis.simulate.config;

import com.wltjack.springdebug.mybatis.simulate.MySqlSession;
import com.wltjack.springdebug.mybatis.simulate.dao.mapper.UserMapper;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * UserMapperFactoryBean
 *
 * @author wltjack
 * Created at 2023/1/1 19:00
 */
@Component
public class UserMapperFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		UserMapper mapper = MySqlSession.getMapper(UserMapper.class);
		return mapper;
	}

	@Override
	public Class<?> getObjectType() {
		return UserMapper.class;
	}
}
