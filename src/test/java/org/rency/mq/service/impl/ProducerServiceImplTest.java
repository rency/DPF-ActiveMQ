package org.rency.mq.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.rency.mq.service.ProducerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ProducerServiceImplTest {

	private ApplicationContext ctx;
	
	@Before
	public void before(){
		ctx = new FileSystemXmlApplicationContext("src/test/resources/applicationContext.xml");
		
	}
	
	@Test
	public void testSendMessage() {
		ProducerService producer = ctx.getBean(ProducerService.class);
		String message = "此条消息为测试消息，发送于 "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date());
		//producer.sendMessage(message);
	}

}
