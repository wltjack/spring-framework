package com.wltjack.springdebug.test.mybatis.simulate2;

import com.wltjack.springdebug.mybatis.simulate2.MySqlSession;
import com.wltjack.springdebug.mybatis.simulate2.config.MyBatisTestConfig3;
import com.wltjack.springdebug.mybatis.simulate2.dao.mapper.UserMapper;
import com.wltjack.springdebug.mybatis.simulate2.dao.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 模拟mybatis测试
 *
 * @author wltjack
 * Created at 2023/1/1 19:34
 */
public class SimulateTest {

	@Test
	public void test() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MyBatisTestConfig3.class);

		UserMapper userMapper = MySqlSession.getMapper(UserMapper.class);
		context.getBeanFactory().registerSingleton("userMapper", userMapper);
		context.refresh();
		UserRepository userRepository = context.getBean(UserRepository.class);
		userRepository.queryUsers();

	}

}
