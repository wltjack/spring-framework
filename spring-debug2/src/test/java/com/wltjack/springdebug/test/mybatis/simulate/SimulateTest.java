package com.wltjack.springdebug.test.mybatis.simulate;

import com.wltjack.springdebug.mybatis.simulate.MySqlSession;
import com.wltjack.springdebug.mybatis.simulate.config.MyBatisTestConfig;
import com.wltjack.springdebug.mybatis.simulate.config.MyBatisTestConfig2;
import com.wltjack.springdebug.mybatis.simulate.dao.mapper.UserMapper;
import com.wltjack.springdebug.mybatis.simulate.dao.repository.UserRepository;
import com.wltjack.springdebug.mybatis.simulate.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * 模拟mybatis测试
 *
 * @author wltjack
 * Created at 2023/1/1 16:48
 */
public class SimulateTest {

	@Test
	public void test1() {
		UserMapper userMapper = MySqlSession.getMapper(UserMapper.class);
		List<Map<String, Object>> resultMap = userMapper.getForMap(1L);
		List<User> users = userMapper.queryUserList();

		System.out.println("----test----");
	}

	/**
	 * @Bean方式
	 */
	@Test
	public void test2() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyBatisTestConfig.class);
		UserRepository userRepository = context.getBean(UserRepository.class);
		userRepository.queryUsers();
	}

	/**
	 * FactoryBean
	 */
	@Test
	public void test3() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyBatisTestConfig2.class);
		UserRepository userRepository = context.getBean(UserRepository.class);
		userRepository.queryUsers();
	}

}
