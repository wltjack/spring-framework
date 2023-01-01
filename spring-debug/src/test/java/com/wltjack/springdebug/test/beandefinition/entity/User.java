package com.wltjack.springdebug.test.beandefinition.entity;

/**
 * User
 *
 * @author wltjack
 * Created at 2022/7/3 21:42
 */
public class User {

	private Long id;

	private String name;

	private String userName;

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
