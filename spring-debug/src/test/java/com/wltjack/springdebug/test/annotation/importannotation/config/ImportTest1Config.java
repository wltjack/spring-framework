package com.wltjack.springdebug.test.annotation.importannotation.config;

import com.wltjack.springdebug.test.annotation.importannotation.entity.Order;
import com.wltjack.springdebug.test.annotation.importannotation.entity.Person;
import com.wltjack.springdebug.test.annotation.importannotation.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * ImportTest1Config
 *
 * @author wltjack
 * Created at 2022/7/3 21:47
 */
@Configuration
// 静态导入
@Import({User.class, Person.class, Order.class})
public class ImportTest1Config {

	@Bean
	public User getUserBean() {
		return new User();
	}

}
