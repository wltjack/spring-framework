package com.wltjack.springdebug.test.introspect.bean;

/**
 * 内省测试bean
 *
 * @author wltjack
 * Created at 2023/6/13 10:16
 */
public class IntrospectDemoTestBean {

	private Integer age;
	private String name;

	//no setter getter
	private String email;


	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public void setPassword(String password){

	}

	public String getPassword(){
		return "xxx";
	}

}
