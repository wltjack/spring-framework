package com.wltjack.springdebug.mybatis.simulate4.dao.mapper;

import com.wltjack.springdebug.mybatis.simulate4.entity.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * AccountMapper
 *
 * @author wltjack
 * Created at 2023/1/19 20:29
 */
public interface AccountMapper {

	@Select("select account_id as accountId, account_name as accountName,account,remark \n" +
			"from test_account")
	List<Account> queryAccountList();

	@Select("select account_id as accountId, account_name as accountName,account,remark \n" +
			"from test_account" +
			"where account_id = #{id}")
	List<Map<String, Object>> getForMap(Long id);

}
