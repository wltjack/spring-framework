package com.wltjack.springdebug.test.cglib.utils;

import com.wltjack.springdebug.test.cglib.bean.A;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.CallbackFilter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;
import org.springframework.context.annotation.ConfigurationClassEnhancer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * SpringEnhancerUtil
 *
 * @author wltjack
 * Created at 2023/6/1 21:56
 */
public class SpringEnhancerUtil3 {

	private static final Callback[] CALLBACKS = new Callback[]{
			new ConfigurationClassEnhancer.BeanMethodInterceptor(),
			new ConfigurationClassEnhancer.BeanFactoryAwareMethodInterceptor(),
			NoOp.INSTANCE
	};

	private static final ConfigurationClassEnhancer.ConditionalCallbackFilter CALLBACK_FILTER = new ConfigurationClassEnhancer.ConditionalCallbackFilter(CALLBACKS);

	/**
	 * 创建一个继承了A的代理对象
	 */
	public Object createProxyClazz(Class clazz) {
		try {
			saveGeneratedCGlibProxyFiles("D:\\temp\\cglib\\");
		} catch (Exception e) {
			e.printStackTrace();
		}

		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(clazz);
		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
		enhancer.setUseFactory(false);
		enhancer.setStrategy(new ConfigurationClassEnhancer.BeanFactoryAwareGeneratorStrategy(this.getClass().getClassLoader()));
		enhancer.setCallbacks(new Callback[]{new MyParentClassCallBack(), new MyChildClassCallBack()});
		// 区别  setCallback会默认为所有方法增强
		//setCallbackFilter 会过滤一些方法，只有符合过滤条件的才会增强
		//setCallbackFilter spring当中主要过滤@Bean方法和setBeanFactory的方法
		enhancer.setCallbackFilter(new CallbackFilter() {
			@Override
			public int accept(Method method) {
				// 不是过滤某个类，是过滤某个方法 ，返回的是数组的下标
				if (method.getName().equals("m0")) {
					return 0;
				} else if (method.getName().equals("m1")) {
					return 1;
				}
				return 0;
			}
		});
//		enhancer.setCallbackTypes(CALLBACK_FILTER.getCallbackTypes());
		Object o = enhancer.create();
		return o;
	}

	public static void saveGeneratedCGlibProxyFiles(String dir) throws Exception {
		Field field = System.class.getDeclaredField("props");
		field.setAccessible(true);
		Properties props = (Properties) field.get(null);
		// dir为保存文件路径
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, dir);
		props.put("net.sf.cglib.core.DebuggingClassWriter.traceEnabled", "true");
	}

	public static void main(String[] args) {
		SpringEnhancerUtil3 springEnhancerUtil = new SpringEnhancerUtil3();
		A a = (A) springEnhancerUtil.createProxyClazz(A.class);
		a.m0();
		a.m1();
	}
}
