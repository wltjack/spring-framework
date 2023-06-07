package com.wltjack.springdebug.test.context.event;

import org.springframework.context.ApplicationEvent;

/**
 * AsyncSendEmailEvent
 *
 * @author wltjack
 * Created at 2023/2/17 22:32
 */
public class AsyncSendEmailEvent extends ApplicationEvent {
	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public AsyncSendEmailEvent(Object source) {
		super(source);
	}

	/**
	 * 邮箱
	 **/
	private String email;

	/**
	 * 主题
	 **/
	private String subject;

	/**
	 * 内容
	 **/
	private String content;

	/**
	 * 接收者
	 **/
	private String targetUserId;


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTargetUserId() {
		return targetUserId;
	}

	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
	}
}
