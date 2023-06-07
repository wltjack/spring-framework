package com.wltjack.springdebug.test.scan.annotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * IsInherited
 *
 * @author wltjack
 * Created at 2023/4/9 9:43
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface IsInherited {
}
