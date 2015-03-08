package org.rency.mq.service.impl;

import org.rency.mq.service.ConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service("consumerService")
public class ConsumerServiceImpl implements ConsumerService {
	
	private final static Logger logger = LoggerFactory.getLogger(ConsumerServiceImpl.class);

	@Autowired
	@Qualifier("jmsTemplate")
	private JmsTemplate jmsTemplate;
	
	@Override
	public void receiveMessage() {
		Object message = this.jmsTemplate.receiveAndConvert();
		logger.info("####### 消费者接受消息 #######");
		logger.info("<<<："+message);
	}

}
