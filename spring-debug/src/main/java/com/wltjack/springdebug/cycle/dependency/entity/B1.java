package com.wltjack.springdebug.cycle.dependency.entity;

/**
 * B1
 *
 * @author wltjack
 * @since V1.0
 * Created at 2022/4/7 22:40
 */
public class B1 {

	private int id;

	private String code;

	private A1 a1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public A1 getA1() {
		return a1;
	}

	public void setA1(A1 a1) {
		this.a1 = a1;
	}

	@Override
	public String toString() {
		return "B1{" +
				"id=" + id +
				", code='" + code + '\'' +
				'}';
	}
}
