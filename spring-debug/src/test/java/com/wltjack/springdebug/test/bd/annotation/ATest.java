package com.wltjack.springdebug.test.bd.annotation;

import java.lang.annotation.*;

/**
 * 注解测试
 *
 * @author wltjack
 * Created at 2022/6/5 21:35
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ATest {

	String id() default "";

	String remark() default "";



}
