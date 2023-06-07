package com.wltjack.springdebug.test.context.event.handler.impl;

import com.wltjack.springdebug.test.context.event.handler.IMessageHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * MessageHandlerImpl
 *
 * @author wltjack
 * Created at 2023/2/17 22:37
 */
@Component
public class MessageHandlerImpl implements IMessageHandler {
	private static final Logger LOGGER = LogManager.getLogger(MessageHandlerImpl.class);

	@Override
	public void sendEmailSms(String email, String subject, String content, String targetUserId) {
		LOGGER.info("发送测试 -- email = {}, subject = {}, content = {}, targetUserId = {}",
				email, subject, content, targetUserId);
	}


}
