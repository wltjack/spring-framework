package com.wltjack.springdebug.test.context.listener;

import com.wltjack.springdebug.test.context.event.ABeanInitEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * ABeanListener
 *
 * @author wltjack
 * Created at 2023/1/20 19:43
 */
@Component
public class ABeanListener implements ApplicationListener<ABeanInitEvent> {
	private static final Logger LOGGER = LogManager.getLogger(ABeanListener.class);

	@Override
	public void onApplicationEvent(ABeanInitEvent event) {
		LOGGER.info("event - 事件类名称: [{}]", event.getClass().getSimpleName());
	}
}
