package com.wltjack.springdebug.test.scan;

import com.wltjack.springdebug.test.scan.bean.inherited.ISBean;
import com.wltjack.springdebug.test.scan.bean.inherited.PImpl;
import com.wltjack.springdebug.test.scan.bean.inherited.SImpl;
import com.wltjack.springdebug.test.scan.bean.inherited.Sinherited;
import com.wltjack.springdebug.test.scan.util.MySpringInheritedScanner;
import com.wltjack.springdebug.test.scan.util.MySpringInterfaceScanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * ScanTest2
 *
 * @author wltjack
 * Created at 2023/4/8 20:54
 */
public class ScanTest2 {
	private static final Logger LOGGER = LogManager.getLogger(ScanTest2.class);

	/**
	 * 测试实现某些接口的被扫描到
	 */
	@Test
	public void interfaceScan() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		MySpringInterfaceScanner myScanner = new MySpringInterfaceScanner(context);
		myScanner.scan("com.wltjack.springdebug.test.scan.bean");

		context.refresh();

		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		System.out.println("beanDefinitionNames: " + Arrays.stream(beanDefinitionNames).collect(Collectors.toList()));
	}

	/**
	 * 测试inherited注解的被扫描到
	 */
	@Test
	public void inheritedScan() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		MySpringInheritedScanner myScanner = new MySpringInheritedScanner(context);
		myScanner.scan("com.wltjack.springdebug.test.scan.bean");

		context.refresh();

		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		System.out.println("beanDefinitionNames: " + Arrays.stream(beanDefinitionNames).collect(Collectors.toList()));
	}


	@Test
	public void inheritedTest() {
		Annotation[] annotations = Sinherited.class.getAnnotations();
		for (Annotation annotation : annotations) {
			LOGGER.info("annotation:{}", annotation);
		}

		LOGGER.info("---------------子类测试--------------------");

		annotations = ISBean.class.getAnnotations();
		for (Annotation annotation : annotations) {
			LOGGER.info("annotation:{}", annotation);
		}

		LOGGER.info("---------------接口测试--------------------");

		annotations = SImpl.class.getAnnotations();
		for (Annotation annotation : annotations) {
			LOGGER.info("annotation:{}", annotation);
		}

		LOGGER.info("---------------子类实现测试--------------------");

		annotations = PImpl.class.getAnnotations();
		for (Annotation annotation : annotations) {
			LOGGER.info("annotation:{}", annotation);
		}

		LOGGER.info("---------------父类实现测试--------------------");
	}

}
