package org.rency.mq.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.rency.mq.service.ConsumerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ConsumerServiceImplTest {

	private ApplicationContext ctx;
	
	@Before
	public void before(){
		ctx = new FileSystemXmlApplicationContext("src/test/resources/applicationContext.xml");
		
	}
	
	@Test
	public void testReceiveMessage() {
		ConsumerService consumerService = ctx.getBean(ConsumerService.class);
		//consumerService.receiveMessage();
	}

}
