package com.wltjack.springdebug.mybatis.simulate.dao.repository;


import com.wltjack.springdebug.mybatis.simulate.entity.User;

import java.util.List;
import java.util.Map;

/**
 * UserRepository
 *
 * @author wltjack
 * Created at 2023/1/1 12:28
 */
public interface UserRepository {

	List<User> queryUsers();

	List<Map<String, Object>> getByUserId(Long id);
}
