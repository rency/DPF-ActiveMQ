package org.rency.mq.listener;

import javax.jms.ExceptionListener;
import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @desc 异常监听器
 * @author T-rency
 * @date 2014年12月23日 上午10:53:23
 */
public class JmsExceptionListener implements ExceptionListener {

	private static final Logger logger = LoggerFactory.getLogger(JmsExceptionListener.class);
	@Override
	public void onException(JMSException e) {
		logger.error("消息队列发生异常.",e);
		e.printStackTrace();
	}

}
