package com.wltjack.springdebug.mybatis.simulate5.dao.repository;

import com.wltjack.springdebug.mybatis.simulate5.entity.Account;

import java.util.List;
import java.util.Map;

/**
 * AccountRepository
 *
 * @author wltjack
 * Created at 2023/1/19 20:34
 */
public interface AccountRepository {

	List<Account> queryAccounts();

	List<Map<String, Object>> getByAccountId(Long id);

}
