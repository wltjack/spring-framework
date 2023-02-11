package com.wltjack.springdebug.mybatis.simulate3.dao.mapper;

import com.wltjack.springdebug.mybatis.simulate3.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * UserMapper
 *
 * @author wltjack
 * Created at 2023/1/1 12:27
 */
@Mapper
public interface UserMapper {

	@Select("select user_id as userId,user_name as userName,user_code as userCode,remark," +
			"create_time as createTime,modified_time as modifiedTime,create_account_id as createAccountId,modified_account_id as modifiedAccountId\n" +
			"from test_user")
	List<User> queryUserList();

	@Select("select user_id as userId,user_name as userName,user_code as userCode,remark," +
			"create_time as createTime,modified_time as modifiedTime,create_account_id as createAccountId,modified_account_id as modifiedAccountId\n" +
			"from test_user where user_id = #{id}")
	List<Map<String, Object>> getForMap(Long id);


}
