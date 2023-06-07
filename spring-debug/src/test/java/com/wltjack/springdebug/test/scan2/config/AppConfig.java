package com.wltjack.springdebug.test.scan2.config;

import com.wltjack.springdebug.test.scan2.bean.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * AppConfig
 *
 * @author wltjack
 * Created at 2023/6/5 21:22
 */
@Configuration
@ComponentScan("com.wltjack.springdebug.test.scan2")
@Import({D.class, E.class, H.class, K.class})
public class AppConfig {


	@Import(C.class)
	class MemberApp {

	}

}
