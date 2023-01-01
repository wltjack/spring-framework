package com.wltjack.springdebug.test.annotation.importannotation.config;

import com.wltjack.springdebug.test.annotation.importannotation.entity.Order;
import com.wltjack.springdebug.test.annotation.importannotation.entity.User;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * MyImportSelector
 *
 * @author wltjack
 * Created at 2022/7/3 22:15
 */
public class MyImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
//		return new String[0];

		return new String[]{User.class.getName(), Order.class.getName()};
	}

}
