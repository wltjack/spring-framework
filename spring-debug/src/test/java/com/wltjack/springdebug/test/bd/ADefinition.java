package com.wltjack.springdebug.test.bd;

/**
 * ADefinition
 *
 * @author wltjack
 * Created at 2022/6/5 21:42
 */
public class ADefinition {

	private String id;

	private String remark;

	public ADefinition() {

	}

	private ADefinition(Builder builder) {
		id = builder.id;
		remark = builder.remark;
	}

	public static Builder builder() {
		return new Builder();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "ADefinition{" +
				"id='" + id + '\'' +
				", remark='" + remark + '\'' +
				'}';
	}

	public static class Builder {
		private String id;
		private String remark;

		private Builder() {
		}

		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder remark(String remark) {
			this.remark = remark;
			return this;
		}

		public ADefinition build() {
			return new ADefinition(this);
		}
	}
}
