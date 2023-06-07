package com.wltjack.springdebug.test.scan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ScanTestConfig
 *
 * @author wltjack
 * Created at 2023/3/7 21:27
 */
@Configuration
@ComponentScan(value = "com.wltjack.springdebug.test.scan")
public class ScanTestConfig {


}
