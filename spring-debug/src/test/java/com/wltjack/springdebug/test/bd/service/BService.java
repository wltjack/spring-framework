package com.wltjack.springdebug.test.bd.service;

import com.wltjack.springdebug.test.bd.annotation.ATest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BService
 *
 * @author wltjack
 * Created at 2022/6/5 22:07
 */
@ATest(id = "001", remark = "BService")
@Service("bService")
public class BService {

	@Autowired
	private AService aService;

	public void test() {
		System.out.println(aService);
	}
}
