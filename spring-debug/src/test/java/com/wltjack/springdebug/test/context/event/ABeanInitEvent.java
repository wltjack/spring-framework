package com.wltjack.springdebug.test.context.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * ABeanInitEvent
 *
 * @author wltjack
 * Created at 2023/1/20 19:40
 */
public class ABeanInitEvent extends ApplicationContextEvent {

	/**
	 * Create a new ContextStartedEvent.
	 *
	 * @param source the {@code ApplicationContext} that the event is raised for
	 *               (must not be {@code null})
	 */
	public ABeanInitEvent(ApplicationContext source) {
		super(source);
	}
}
