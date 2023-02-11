package com.wltjack.springdebug.mybatis.simulate4.entity;

/**
 * User
 *
 * @author wltjack
 * Created at 2023/1/1 12:22
 */
public class Account extends BaseDo {
	private Long accountId;
	private String accountName;
	private String account;
	private String remark;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
