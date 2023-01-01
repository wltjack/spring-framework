package com.wltjack.springdebug.test.di.supplier.config;

import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

/**
 * SuppilerTestConfig
 *
 * @author wltjack
 * Created at 2022/12/31 21:17
 */
@Component
@ImportResource("classpath:di-supplier.xml")
public class SuppilerTestConfig {

}
