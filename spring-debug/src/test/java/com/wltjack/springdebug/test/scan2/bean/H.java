package com.wltjack.springdebug.test.scan2.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


public class H implements ImportSelector {
	private static final Logger LOGGER = LogManager.getLogger(H.class);

	public H(){
		LOGGER.info("create h  不会存在单例池当中");
	}
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.wltjack.springdebug.test.scan2.bean.selector.Z","com.wltjack.springdebug.test.scan2.bean.selector.X"};
	}
}
