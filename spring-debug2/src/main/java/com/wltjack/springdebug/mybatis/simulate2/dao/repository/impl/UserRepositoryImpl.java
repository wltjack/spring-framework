package com.wltjack.springdebug.mybatis.simulate2.dao.repository.impl;

import com.wltjack.springdebug.mybatis.simulate2.dao.mapper.UserMapper;
import com.wltjack.springdebug.mybatis.simulate2.dao.repository.UserRepository;
import com.wltjack.springdebug.mybatis.simulate2.entity.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * UserRepository实现
 *
 * @author wltjack
 * Created at 2023/1/1 12:28
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
	@Resource
	private UserMapper userMapper;

	public UserRepositoryImpl(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public List<User> queryUsers() {
		return userMapper.queryUserList();
	}

	@Override
	public List<Map<String, Object>> getByUserId(Long id) {
		return userMapper.getForMap(id);
	}
}
