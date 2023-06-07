package com.wltjack.springdebug.test.scan.config;

import com.wltjack.springdebug.test.scan.util.MyBeanNameGenerator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ScanTestConfig
 *
 * @author wltjack
 * Created at 2023/3/7 21:27
 */
//@ComponentScan(value = "com.test.scan",nameGenerator = MyBeanNameGenerator1.class,
//		excludeFilters ={
//				@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = X.class)
//		},includeFilters = {
//		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = E.class)
//		//@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = E.class)
//}
//
//)
@Configuration
@ComponentScan(value = "com.wltjack.springdebug.test.scan", nameGenerator = MyBeanNameGenerator.class)
public class ScanTestConfig2 {


}
