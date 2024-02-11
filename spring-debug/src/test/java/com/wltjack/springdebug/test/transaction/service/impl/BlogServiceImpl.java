package com.wltjack.springdebug.test.transaction.service.impl;

import com.wltjack.springdebug.test.transaction.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * BlogService
 *
 * @author wltjack
 * Created at 2023/6/14 20:49
 */
@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	private PlatformTransactionManager transactionManager;

	@Autowired
	TransactionTemplate transactionTemplate;

	@Override
	public void updateOne() {
		jdbcTemplate.update("update blog set content=? where id=?", "test123", 1);
		int i = 1 / 0;
	}

	@Override
	public void updateOneWithPlatformTransactionManager() {
		DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
		definition.setName("test11");

		TransactionStatus transaction = transactionManager.getTransaction(definition);
		try {
			jdbcTemplate.update("update blog set content=? where id=?", "test123", 1);
			int i = 1 / 0;
			jdbcTemplate.update("update blog set content=? where id=?", "test456", 2);
			transactionManager.commit(transaction);
		} catch (Exception e) {
			e.printStackTrace();
			transactionManager.rollback(transaction);
		}
	}

	@Override
	public void updateOneWithTransactionTemplate() {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				try {
					jdbcTemplate.update("update blog set content=? where id=?", "test123", 1);
					int i = 1 / 0;
					jdbcTemplate.update("update blog set content=? where id=?", "test456", 2);
				} catch (Exception e) {
					e.printStackTrace();
					status.setRollbackOnly();
				}
			}
		});
	}

	@Override
	@Transactional
	public void updateOneWithAnnoTransaction() {
		jdbcTemplate.update("update blog set content=? where id=?", "test123", 1);
		int i = 1 / 0;
	}

}
