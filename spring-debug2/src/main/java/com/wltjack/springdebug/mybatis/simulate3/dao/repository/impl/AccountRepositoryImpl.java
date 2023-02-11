package com.wltjack.springdebug.mybatis.simulate3.dao.repository.impl;

import com.wltjack.springdebug.mybatis.simulate3.dao.mapper.AccountMapper;
import com.wltjack.springdebug.mybatis.simulate3.dao.repository.AccountRepository;
import com.wltjack.springdebug.mybatis.simulate3.entity.Account;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * AccountRepositoryImpl
 *
 * @author wltjack
 * Created at 2023/1/19 20:35
 */
public class AccountRepositoryImpl implements AccountRepository {

	@Resource
	private AccountMapper accountMapper;

	@Override
	public List<Account> queryAccounts() {
		return accountMapper.queryAccountList();
	}

	@Override
	public List<Map<String, Object>> getByAccountId(Long id) {
		return accountMapper.getForMap(id);
	}
}
