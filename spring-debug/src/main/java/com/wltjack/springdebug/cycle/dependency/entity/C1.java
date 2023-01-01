package com.wltjack.springdebug.cycle.dependency.entity;

/**
 * C1
 *
 * @author wltjack
 * Created at 2022/4/18 22:25
 * @since V1.0
 */
public class C1 {

	private int id;

	private String remark;

	private C1 c1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public C1 getC1() {
		return c1;
	}

	public void setC1(C1 c1) {
		this.c1 = c1;
	}

	@Override
	public String toString() {
		return "C1{" +
				"id=" + id +
				", remark='" + remark + '\'' +
				'}';
	}
}
