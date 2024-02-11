package com.wltjack.springdebug.test.aop3.service;

public interface AopTestService {
	void m();

	default String m1(Integer i) {

		return "m1";
	}

}
