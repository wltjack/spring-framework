package com.wltjack.springdebug.test.cycle.dependency2;

import com.wltjack.springdebug.test.cycle.dependency2.entity.A2;
import com.wltjack.springdebug.test.cycle.dependency2.entity.B2;
import com.wltjack.springdebug.test.cycle.dependency2.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * CycleTest
 *
 * @author wltjack
 * Created at 2022/5/2 20:36
 */
public class CycleTest {

	@Test
	void cycle() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		A2 bean = context.getBean(A2.class);
		B2 bean1 = context.getBean(B2.class);
	}


}
