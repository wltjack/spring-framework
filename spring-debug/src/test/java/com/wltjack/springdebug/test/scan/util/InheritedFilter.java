package com.wltjack.springdebug.test.scan.util;

import com.wltjack.springdebug.test.scan.annotation.IsInherited;
import org.springframework.core.type.filter.AbstractTypeHierarchyTraversingFilter;
import org.springframework.core.type.filter.TypeFilter;

import java.lang.annotation.Annotation;

/**
 * InterFaceFilter
 *
 * @author wltjack
 * Created at 2023/4/8 21:04
 */
public class InheritedFilter extends AbstractTypeHierarchyTraversingFilter implements TypeFilter {

	protected InheritedFilter(boolean considerInherited, boolean considerInterfaces) {
		super(considerInherited, considerInterfaces);
	}


	@Override
	protected Boolean matchSuperClass(String superClassName) {
//		if (superClassName.equals("com.wltjack.springdebug.test.scan.bean.inherited.Pinherited")) {
//			return true;
//		}

		Class<?> aClass = null;
		try {
			aClass = Class.forName(superClassName);
			Annotation[] annotations = aClass.getAnnotations();
			for (Annotation annotation : annotations) {
				if(annotation.annotationType() == IsInherited.class){
					return true;
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}

}
