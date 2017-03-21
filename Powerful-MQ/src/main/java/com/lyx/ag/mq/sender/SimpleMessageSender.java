package com.lyx.ag.mq.sender;

import javax.jms.Destination;

import org.springframework.jms.core.JmsTemplate;

/**
 * 
 * @author liyixiang
 * @date 2017年3月14日
 * @use
 * 		基础消息发送者
 */
public class SimpleMessageSender extends AbstractJmsTemplateSender {

	//消息发送目的地
	private final Destination destination;

	public SimpleMessageSender(JmsTemplate jmsTemplate , Destination destination) {
		// TODO Auto-generated constructor stub
		this.jmsTemplate = jmsTemplate;
		this.destination = destination;
	}
	
	@Override
	public <T> void send(T message) {
		// TODO Auto-generated method stub
		jmsTemplate.convertAndSend(destination, message);
	}

}
