package org.rency.mq.service;

public interface ProducerService {
	
	/**
	 * @desc 发送消息
	 * @date 2014年12月23日 下午3:04:45
	 * @param message
	 * @throws CoreException
	 */
	public void sendMessage(Object message);
}