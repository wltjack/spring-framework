package com.wltjack.springdebug.test.annotation.importannotation.entity;

/**
 * User
 *
 * @author wltjack
 * Created at 2022/7/3 21:42
 */
public class User {

	private Long id;

	private String name;

	private String desc;

	public void test() {
		System.out.println("User test()...");
	}

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
}
