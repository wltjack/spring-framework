package com.wltjack.springdebug.test.di.lookup;

import com.wltjack.springdebug.test.di.lookup.config.LookUpTestConfig;
import com.wltjack.springdebug.test.di.lookup.entity.LA;
import com.wltjack.springdebug.test.di.lookup.entity.LC;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * lookup测试
 *
 * @author kangliang
 * Created at 2022/12/18 22:41
 */
public class LookUpTest {

	@Test
	public void test() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(LookUpTestConfig.class);
		context.refresh();

		LA la = context.getBean(LA.class);
		la.printInfo();

		System.out.println("===========");
		LC lc = context.getBean(LC.class);
		lc.printInfo();
	}
}
