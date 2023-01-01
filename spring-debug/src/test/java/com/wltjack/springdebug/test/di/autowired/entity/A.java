package com.wltjack.springdebug.test.di.autowired.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * A
 *
 * @author kangliang
 * Created at 2022/11/27 20:56
 */
@Component
public class A {

	public A() {

	}

	@Autowired
	private M m;

//	@Resource
//	private N n;


	@Override
	public String toString() {
		return "A{" +
				"m=" + m +
				'}';
	}
}
