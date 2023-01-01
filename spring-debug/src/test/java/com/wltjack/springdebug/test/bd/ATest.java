package com.wltjack.springdebug.test.bd;

import com.wltjack.springdebug.test.bd.service.AService;
import com.wltjack.springdebug.test.bd.service.BService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * BeanDefinition测试
 *
 * @author wltjack
 * Created at 2022/6/5 21:59
 */
public class ATest {

	@Test
	void beanDefinition() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		List<ADefinition> aDefinitionList = AnnotationScanner.scan();
		System.out.println(aDefinitionList);

		AService aService = context.getBean("aService", AService.class);
		BService bService = context.getBean("bService", BService.class);
		bService.test();
	}

}
