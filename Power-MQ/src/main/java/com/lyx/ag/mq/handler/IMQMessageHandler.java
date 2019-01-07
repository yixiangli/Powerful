package com.lyx.ag.mq.handler;

/**
 * 
 * @author liyixiang
 * @date 2017年3月21日
 * @use
 * 		mq消息处理类
 */
public interface IMQMessageHandler<T> {

	/**
	 * 是否可支持处理的消息类型
	 * @return
	 */
	public boolean support(T message);
	
	
	
	/**
	 * 处理执行
	 * @param message
	 */
	public void handle(T message);
}
