package com.wltjack.springdebug.test.context.aware;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * FBean
 *
 * @author wltjack
 * Created at 2023/1/24 18:26
 */
@Component("fBean")
public class FBean implements IAware {
	private static final Logger LOGGER = LogManager.getLogger(FBean.class);

	KBeanInterface k;

	@Override
	public void setK(KBeanInterface k) {
		LOGGER.info("FBean setK() : {}", k);
	}

	public KBeanInterface getK() {
		return k;
	}

}
