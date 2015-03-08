package org.rency.mq.listener;

import javax.jms.Message;
import javax.jms.MessageListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @desc 消息接受者监听器
 * @author T-rency
 * @date 2014年12月23日 上午10:50:49
 */
@Component
public class ConsumerListener implements MessageListener{
	
	private static final Logger logger = LoggerFactory.getLogger(ConsumerListener.class);

	@Override
	public void onMessage(Message message) {
		logger.info("####### 消费者接受消息 #######");
		logger.info("<<<："+message.toString());
	}

}
