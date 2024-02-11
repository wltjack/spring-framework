package com.wltjack.springdebug.test.transaction.service;

public interface BlogService {

	void updateOne();

	void updateOneWithPlatformTransactionManager();

	void updateOneWithTransactionTemplate();

	void updateOneWithAnnoTransaction();
}
