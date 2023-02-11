package com.wltjack.springdebug.mybatis.simulate3.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * BaseDo
 *
 * @author wltjack
 * Created at 2023/1/1 12:32
 */
public class BaseDo implements Serializable {
	private static final long serialVersionUID = 2393743478688834001L;

	private Date createTime;

	private Date modifiedTime;

	private Long createAccountId;

	private Long modifiedAccountId;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Long getCreateAccountId() {
		return createAccountId;
	}

	public void setCreateAccountId(Long createAccountId) {
		this.createAccountId = createAccountId;
	}

	public Long getModifiedAccountId() {
		return modifiedAccountId;
	}

	public void setModifiedAccountId(Long modifiedAccountId) {
		this.modifiedAccountId = modifiedAccountId;
	}

}
