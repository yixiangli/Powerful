package com.lyx.ag.mq.sender;

import org.springframework.jms.core.JmsTemplate;

/**
 * 
 * @author liyixiang
 * @date 2017年3月21日
 * @use
 * 		基于jmsTemplate的发送者抽象
 */
public abstract class AbstractJmsTemplateSender implements IMessageSender{

	//jms模版
	protected JmsTemplate jmsTemplate;
}
