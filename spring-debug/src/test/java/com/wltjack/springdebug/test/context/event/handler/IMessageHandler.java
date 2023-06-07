package com.wltjack.springdebug.test.context.event.handler;

/**
 * IMessageHandler
 *
 * @author wltjack
 * Created at 2023/2/17 22:37
 */
public interface IMessageHandler {

	void sendEmailSms(String email, String subject, String content, String targetUserId);
}
