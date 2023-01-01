package com.wltjack.springdebug.di.staticfactory.entity;

/**
 * ABean
 *
 * @author kangliang
 * Created at 2022/6/19 21:42
 */
public class ABean {

	private BBean bBean;
	private CBean cBean;
	private int i;

	// 私有化构造函数
	private ABean() {

	}

	private ABean(BBean bBean,
				  CBean cBean,
				  int i) {
		this.bBean = bBean;
		this.cBean = cBean;
		this.i = i;
	}

	public static ABean createInstance(BBean bBean,
									   CBean cBean,
									   int i) {
		return new ABean(bBean, cBean, i);
	}

	public void test() {
		System.out.println("bBean=" + bBean + ",cBean=" + cBean + ",i=" + i);
	}

	public void setbBean(BBean bBean) {
		this.bBean = bBean;
	}

	public void setcBean(CBean cBean) {
		this.cBean = cBean;
	}

	public void setI(int i) {
		this.i = i;
	}
}
