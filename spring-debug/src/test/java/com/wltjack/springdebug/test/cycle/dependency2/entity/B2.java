package com.wltjack.springdebug.test.cycle.dependency2.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * B2
 *
 * @author wltjack
 * Created at 2022/5/2 20:31
 */
@Component
public class B2 {

	@Autowired
	private A2 a2;

}
