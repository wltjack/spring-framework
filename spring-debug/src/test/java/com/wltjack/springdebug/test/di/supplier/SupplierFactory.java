package com.wltjack.springdebug.test.di.supplier;

import com.wltjack.springdebug.di.supplier.entity.A1;
import org.springframework.beans.factory.annotation.Lookup;

/**
 * SupplierFactory
 * <br/>
 * supplier不需要通过反射，而是在supplierFactory中直接实例化对象，所以supplier的效率比其他方式要高。
 *
 * @author wltjack
 * Created at 2022/12/31 21:39
 */
public class SupplierFactory {

	public Object instanceObject() {
		return new A1(2.0f);
	}

	@Lookup
	public static Object getObject() {
		return new A1(3.0f);
	}
}
