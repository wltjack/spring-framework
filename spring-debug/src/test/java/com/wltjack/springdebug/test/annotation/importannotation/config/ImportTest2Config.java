package com.wltjack.springdebug.test.annotation.importannotation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * ImportTest2Config
 *
 * @author kangliang
 * Created at 2022/7/3 22:18
 */
@Configuration
@Import(MyImportSelector.class)
public class ImportTest2Config {


}
