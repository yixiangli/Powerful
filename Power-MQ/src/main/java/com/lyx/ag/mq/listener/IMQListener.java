package com.lyx.ag.mq.listener;

/**
 * 
 * @author liyixiang
 * @date 2017年3月21日
 * @use
 * 		mq消息监听器
 */
public interface IMQListener<T> {

	/**
	 * message处理
	 * @param message
	 */
	public void handleMessage(T message);

}
