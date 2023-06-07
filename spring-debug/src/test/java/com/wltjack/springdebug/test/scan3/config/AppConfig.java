package com.wltjack.springdebug.test.scan3.config;

import com.wltjack.springdebug.test.scan3.beans.selector.X;
import com.wltjack.springdebug.test.scan3.beans.selector.Y;
import com.wltjack.springdebug.test.scan3.beans.selector.Z;
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
@ComponentScan("com.wltjack.springdebug.test.scan3")
//@Import({X.class})
//@Import({Z.class})
public class AppConfig {


}
