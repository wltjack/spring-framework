package com.wltjack.springdebug.test.di.order.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * T
 *
 * @author kangliang
 * Created at 2022/12/18 21:52
 */
@Component
public class T {

	private List<E> bfpps;

	public List<E> getBfpps() {
		return bfpps;
	}

	@Autowired
	public void setBfpps(List<E> bfpps) {
		this.bfpps = bfpps;
	}
}
