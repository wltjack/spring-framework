package com.wltjack.springdebug.test.mybatis.demo;

import com.wltjack.springdebug.mybatis.demo.config.MybatisConfig;
import com.wltjack.springdebug.mybatis.demo.dao.mapper.UserMapper;
import com.wltjack.springdebug.mybatis.demo.dao.repository.UserRepository;
import com.wltjack.springdebug.mybatis.demo.entity.User;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * UserQueryTest
 *
 * @author wltjack
 * Created at 2023/1/1 12:35
 */
public class UserQueryTest {

	@Test
	public void onlyMybatis() {
		MybatisConfig config = new MybatisConfig();

		DataSource dataSource = config.dataSource();
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment environment = new Environment("development", transactionFactory, dataSource);
		Configuration configuration = new Configuration(environment);

		configuration.addMapper(UserMapper.class);

		SqlSessionFactory sqlSessionFactory =
				new SqlSessionFactoryBuilder().build(configuration);

		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			// jdk动态代理生成mapper代理对象
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			List<Map<String, Object>> resultMap = userMapper.getForMap(1L);
			System.out.println("resultMap: " + resultMap);
		}

	}


	@Test
	public void springMybatis() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MybatisConfig.class);

		UserRepository userRepository = context.getBean(UserRepository.class);
//		List<Map<String, Object>> resultMap = userRepository.getByUserId(1L);
//		System.out.println("resultMap: " + resultMap);
		List<User> users = userRepository.queryUsers();
		System.out.println("userList: " + users);
	}


}
