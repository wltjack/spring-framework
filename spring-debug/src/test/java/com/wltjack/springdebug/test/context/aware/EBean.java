package com.wltjack.springdebug.test.context.aware;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * EBean
 *
 * @author wltjack
 * Created at 2023/1/24 18:24
 */
@Component("eBean")
public class EBean {
	private static final Logger LOGGER = LogManager.getLogger(EBean.class);

	KBeanInterface k;

	public void setK(KBeanInterface k) {
		LOGGER.info("EBean setK() : {}", k);
		this.k = k;
	}

	public KBeanInterface getK() {
		return k;
	}
}
