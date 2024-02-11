package com.wltjack.springdebug.test.transaction.service.impl;

import com.wltjack.springdebug.test.transaction.service.PropagationBlogService1;
import com.wltjack.springdebug.test.transaction.service.PropagationBlogService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PropagationBlogService1Impl implements PropagationBlogService1 {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	PropagationBlogService2 propagationBlogService2;

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void updateOne() {
		jdbcTemplate.update("update blog set content=? where id=?", "test123", 1);
		propagationBlogService2.updateOne();
		int i = 1 / 0;
	}
}
