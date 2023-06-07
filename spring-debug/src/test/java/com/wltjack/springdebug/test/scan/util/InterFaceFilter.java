package com.wltjack.springdebug.test.scan.util;

import org.springframework.core.type.filter.AbstractTypeHierarchyTraversingFilter;
import org.springframework.core.type.filter.TypeFilter;

/**
 * InterFaceFilter
 *
 * @author wltjack
 * Created at 2023/4/8 21:04
 */
public class InterFaceFilter extends AbstractTypeHierarchyTraversingFilter implements TypeFilter {

	protected InterFaceFilter(boolean considerInherited, boolean considerInterfaces) {
		super(considerInherited, considerInterfaces);
	}

	@Override
	protected Boolean matchInterface(String interfaceName) {
		if (interfaceName.equals("com.wltjack.springdebug.test.scan.bean.ID")) {
			return true;
		}
		return null;
	}
}
