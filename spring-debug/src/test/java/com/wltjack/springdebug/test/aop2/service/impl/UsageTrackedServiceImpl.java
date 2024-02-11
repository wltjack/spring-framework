package com.wltjack.springdebug.test.aop2.service.impl;

import com.wltjack.springdebug.test.aop2.service.UsageTrackedService;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service(value = "defaultUsageTrackedService")
public class UsageTrackedServiceImpl implements UsageTrackedService {
	private final AtomicInteger atomicInteger = new AtomicInteger(0);

	@Override
	public int incrementUseCount() {
		return atomicInteger.incrementAndGet();
	}

	@Override
	public int getUseCount() {
		return atomicInteger.get();
	}

	@Override
	public String test() {
		return "aaaaa";
	}

}
