package com.wltjack.springdebug.test.context.event.handler;

import com.wltjack.springdebug.test.context.event.AsyncSendEmailEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * AsyncSendEmailEventHandler
 *
 * @author wltjack
 * Created at 2023/2/17 22:35
 */
@Component
public class AsyncSendEmailEventHandler implements ApplicationListener<AsyncSendEmailEvent> {

	@Resource
	private IMessageHandler messageHandler;

	@Async
	@Override
	public void onApplicationEvent(AsyncSendEmailEvent event) {
		if (event == null) {
			return;
		}

		messageHandler.sendEmailSms(event.getEmail(), event.getEmail(), event.getContent(), event.getTargetUserId());
	}

}
