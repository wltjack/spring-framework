package com.wltjack.springdebug.test.annotation.importannotation.entity;

/**
 * Person
 *
 * @author wltjack
 * Created at 2022/4/20 23:15
 * @since V1.0
 */
public class Person {

	private Long id;

	private String name;

	private String desc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", desc='" + desc + '\'' +
				'}';
	}
}
