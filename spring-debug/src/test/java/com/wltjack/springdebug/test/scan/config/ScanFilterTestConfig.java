package com.wltjack.springdebug.test.scan.config;

import com.wltjack.springdebug.test.scan.bean.B;
import com.wltjack.springdebug.test.scan.bean.E;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * ScanFilterTestConfig
 *
 * @author wltjack
 * Created at 2023/3/7 21:27
 */
@ComponentScan(value = "com.wltjack.springdebug.test.scan.bean",
		excludeFilters = {
				@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = B.class)
		}, includeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = E.class)
		//@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = E.class)
}

)
@Configuration
public class ScanFilterTestConfig {


}
