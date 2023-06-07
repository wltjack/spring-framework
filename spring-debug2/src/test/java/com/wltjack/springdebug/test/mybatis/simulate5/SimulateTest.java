package com.wltjack.springdebug.test.mybatis.simulate5;

import com.wltjack.springdebug.mybatis.simulate5.dao.repository.AccountRepository;
import com.wltjack.springdebug.mybatis.simulate5.dao.repository.UserRepository;
import com.wltjack.springdebug.mybatis.simulate5.entity.Account;
import com.wltjack.springdebug.mybatis.simulate5.entity.User;
import com.wltjack.springdebug.mybatis.simulate5.config.MyBatisTestConfig6;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * 模拟mybatis测试
 *
 * @author wltjack
 * Created at 2023/1/19 20:43
 */
public class SimulateTest {

	@Test
	public void myMapperScanTest() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MyBatisTestConfig6.class);

		UserRepository userRepository = context.getBean(UserRepository.class);
		List<User> users = userRepository.queryUsers();

		AccountRepository accountRepository = context.getBean(AccountRepository.class);
		List<Account> accounts = accountRepository.queryAccounts();

	}

}
