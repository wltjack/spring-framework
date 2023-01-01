package com.wltjack.springdebug.test.other;

import com.wltjack.springdebug.cycle.dependency.entity.A1;
import com.wltjack.springdebug.cycle.dependency.entity.B1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * ClassTest
 *
 * @author wltjack
 * Created at 2022/4/20 21:28
 * @since V1.0
 */
class ClassTest {

	@Test
	void testIsInstance() {
		A1 a1 = new A1();
		boolean instance = A1.class.isInstance(a1);
		boolean instance2 = B1.class.isInstance(a1);
		Assertions.assertTrue(instance);
		Assertions.assertTrue(instance2);
	}
}
