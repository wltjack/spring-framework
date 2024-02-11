package com.wltjack.springdebug.test.transaction;

import com.wltjack.springdebug.test.transaction.config.AppConfig;
import com.wltjack.springdebug.test.transaction.service.BlogService;
import com.wltjack.springdebug.test.transaction.service.PropagationBlogService1;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TransactionTest
 *
 * @author wltjack
 * Created at 2023/6/14 20:52
 */
public class TransactionTest {

	@Test
	public void testJdbcTemplate() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		BlogService blogService = context.getBean(BlogService.class);
		blogService.updateOne();
	}

	@Test
	public void testTransactionManager() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		BlogService blogService = context.getBean(BlogService.class);
		blogService.updateOneWithPlatformTransactionManager();
	}

	@Test
	public void testTransactionTemplate() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		BlogService blogService = context.getBean(BlogService.class);
		blogService.updateOneWithTransactionTemplate();
	}

	@Test
	public void testAnnoTransaction() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		BlogService blogService = context.getBean(BlogService.class);
		blogService.updateOneWithAnnoTransaction();
	}

	@Test
	public void testTransactionPropagation() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		PropagationBlogService1 propagationBlogService1 = context.getBean(PropagationBlogService1.class);
		propagationBlogService1.updateOne();
	}

}
