package com.wltjack.springdebug.test.introspect;

import com.wltjack.springdebug.test.introspect.bean.IntrospectDemoTestBean;
import com.wltjack.springdebug.test.introspect.bean.SpringFieldInjectDemoTestBean;
import com.wltjack.springdebug.test.introspect.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 内省测试
 *
 * @author wltjack
 * Created at 2023/6/13 10:18
 */
public class IntrospectTest {

	@Test
	public void testIntrospect(){
		Map<String, PropertyDescriptor> propertyDescriptorMap = new HashMap<>();

		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(IntrospectDemoTestBean.class);
			PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor pd : pds) {
				propertyDescriptorMap.put(pd.getName(), pd);
			}

			PropertyDescriptor agePd = propertyDescriptorMap.get("age");

			Method ageSetter = propertyDescriptorMap.get("age").getWriteMethod();


		} catch (IntrospectionException e) {
			e.printStackTrace();
		}


	}


	@Test
	public void testSpringFieldInject(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();

		SpringFieldInjectDemoTestBean bean = context.getBean(SpringFieldInjectDemoTestBean.class);
		bean.printf();
	}
}
