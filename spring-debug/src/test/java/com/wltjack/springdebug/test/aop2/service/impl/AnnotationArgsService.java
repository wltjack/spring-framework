package com.wltjack.springdebug.test.aop2.service.impl;

import com.wltjack.springdebug.test.aop2.vo.MyParameter;
import com.wltjack.springdebug.test.aop2.vo.MyParameterWithAnno;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * AnnotationArgsService
 *
 * @author wltjack
 * Created at 2023/6/8 20:35
 */
@Service
public class AnnotationArgsService {
	private static final Logger LOGGER = LogManager.getLogger(AnnotationArgsService.class);

	public void method1(MyParameter parameter) {
		LOGGER.info("method1 > {} ", parameter);
	}

	public void method2(MyParameterWithAnno parameter) {
		LOGGER.info("method2 > {} ", parameter);
	}

	public void method3(MyParameterWithAnno parameter, Integer i) {
		LOGGER.info("method3 > {}  - {}", parameter, i);
	}

}
