package com.lyx.ag.mq.sender;

/**
 * 
 * @author liyixiang
 * @date 2017年3月14日
 * @use	
 * 		消息发送者
 */
public interface IMessageSender {

	<T> void send(T message);
}
