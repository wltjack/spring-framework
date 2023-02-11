package com.wltjack.springdebug.test.mybatis.simulate4;

import com.wltjack.springdebug.mybatis.simulate4.config.MyBatisTestConfig5;
import com.wltjack.springdebug.mybatis.simulate4.dao.repository.AccountRepository;
import com.wltjack.springdebug.mybatis.simulate4.dao.repository.UserRepository;
import com.wltjack.springdebug.mybatis.simulate4.entity.Account;
import com.wltjack.springdebug.mybatis.simulate4.entity.User;
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
				new AnnotationConfigApplicationContext(MyBatisTestConfig5.class);

		UserRepository userRepository = context.getBean(UserRepository.class);
		List<User> users = userRepository.queryUsers();

		AccountRepository accountRepository = context.getBean(AccountRepository.class);
		List<Account> accounts = accountRepository.queryAccounts();

	}

}
