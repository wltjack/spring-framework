package com.wltjack.springdebug.test.aop2.service;

/**
 * UsageTrackedService
 *
 * @author wltjack
 * Created at 2023/6/8 16:44
 */
public interface UsageTrackedService {

	int incrementUseCount();

	int getUseCount();

	String test();
}
