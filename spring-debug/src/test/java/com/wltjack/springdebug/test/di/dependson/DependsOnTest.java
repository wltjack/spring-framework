package com.wltjack.springdebug.test.di.dependson;

import com.wltjack.springdebug.test.di.dependson.config.DependsOnTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * DependsOn测试
 *
 * @author wltjack
 * Created at 2022/12/31 17:45
 */
public class DependsOnTest {


	@Test
	public void test() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(DependsOnTestConfig.class);
		context.refresh();
	}

}
