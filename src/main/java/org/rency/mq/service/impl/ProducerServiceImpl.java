package org.rency.mq.service.impl;

import org.rency.mq.service.ProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service("producerService")
public class ProducerServiceImpl implements ProducerService {
	
	private final static Logger logger = LoggerFactory.getLogger(ProducerServiceImpl.class);
	
	@Autowired
	@Qualifier("jmsTemplate")
	private JmsTemplate jmsTemplate;
	
	@Override
	public void sendMessage(Object message){
		logger.info("####### 生产者发送消息 #######");
		jmsTemplate.convertAndSend(message);
		logger.info(">>>:"+message.toString());
	}

}
