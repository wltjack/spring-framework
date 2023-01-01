package com.wltjack.springdebug.test.injectmodel;

import com.wltjack.springdebug.test.injectmodel.config.ModelBeanFactoryPostProcessor2;
import com.wltjack.springdebug.test.injectmodel.config.ModelConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring注入模型测试
 *
 * @author kangliang
 * Created at 2022/11/27 16:06
 */
public class InjectModelTest2 {

	@Test
	void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ModelConfig.class);
		// 改变A的注入模型
		context.register(ModelBeanFactoryPostProcessor2.class);
		context.refresh();

	}
}
