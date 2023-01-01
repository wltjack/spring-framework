package com.wltjack.springdebug.cycle.dependency.entity;


/**
 * A1
 *
 * @author wltjack
 * @since V1.0
 * Created at 2022/4/7 22:39
 */
public class A1 {
	private int id;

	private String name;

	private B1 b1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public B1 getB1() {
		return b1;
	}

	public void setB1(B1 b1) {
		this.b1 = b1;
	}

	@Override
	public String toString() {
		return "A1{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
