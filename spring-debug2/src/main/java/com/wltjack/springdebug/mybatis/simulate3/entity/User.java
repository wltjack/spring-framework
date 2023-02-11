package com.wltjack.springdebug.mybatis.simulate3.entity;

/**
 * User
 *
 * @author wltjack
 * Created at 2023/1/1 12:22
 */
public class User extends BaseDo {
	private Long userId;
	private String userName;
	private String userCode;
	private String remark;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}


	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", userCode='" + userCode + '\'' +
				", remark='" + remark + '\'' +
				'}';
	}
}
