package com.wltjack.springdebug.mybatis.simulate5.util;

import com.wltjack.springdebug.mybatis.simulate5.MySqlSession;
import org.springframework.beans.factory.FactoryBean;

/**
 * MyFactoryBean
 *
 * @author wltjack
 * Created at 2023/1/2 17:05
 */
public class MyFactoryBean<T> implements FactoryBean {

	private Class<T> mapperInterface;

	@Override
	public Object getObject() throws Exception {
		T mapper = MySqlSession.getMapper(mapperInterface);
		return mapper;
	}

	@Override
	public Class<?> getObjectType() {
		return mapperInterface;
	}

	public Class<T> getMapperInterface() {
		return mapperInterface;
	}

	public void setMapperInterface(Class<T> mapperInterface) {
		this.mapperInterface = mapperInterface;
	}
}
