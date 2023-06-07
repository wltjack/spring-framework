package com.wltjack.springdebug.mybatis.simulate5.dao.repository.impl;

import com.wltjack.springdebug.mybatis.simulate5.dao.mapper.AccountMapper;
import com.wltjack.springdebug.mybatis.simulate5.dao.repository.AccountRepository;
import com.wltjack.springdebug.mybatis.simulate5.entity.Account;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * AccountRepositoryImpl
 *
 * @author wltjack
 * Created at 2023/1/19 20:35
 */
@Repository
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
