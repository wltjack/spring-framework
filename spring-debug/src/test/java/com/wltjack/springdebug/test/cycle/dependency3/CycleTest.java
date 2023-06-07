package com.wltjack.springdebug.test.cycle.dependency3;

import com.wltjack.springdebug.test.cycle.dependency3.config.CycleTestConfig;
import com.wltjack.springdebug.test.cycle.dependency3.entity.N;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * CycleTest
 *
 * @author wltajck
 * Created at 2023/2/19 16:57
 */
public class CycleTest {

	@Test
	public void test() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(CycleTestConfig.class);

		try {
			context.getBean(N.class).afterPropertiesSet();
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}
