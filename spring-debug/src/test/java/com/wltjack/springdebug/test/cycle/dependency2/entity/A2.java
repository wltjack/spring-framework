package com.wltjack.springdebug.test.cycle.dependency2.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * A2
 *
 * @author wltjack
 * Created at 2022/5/2 20:30
 */
@Component
public class A2 {

	@Autowired
	private B2 b2;

}
