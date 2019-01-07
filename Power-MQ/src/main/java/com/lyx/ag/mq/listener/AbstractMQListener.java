package com.lyx.ag.mq.listener;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lyx.ag.mq.handler.IMQMessageHandler;

/**
 * 
 * @author liyixiang
 * @date 2017年3月21日
 * @use	mq监听基础实现 
 * @param <T>
 */
public abstract class AbstractMQListener<T> implements IMQListener<T> {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	//监听器集合 系统初始化时生成完毕
	private final List<IMQMessageHandler<T>> messageHandlers;
	
	public AbstractMQListener() {
		messageHandlers = new ArrayList<IMQMessageHandler<T>>();
	}
	//处理消息
	public void handleMessage(T message) {
		logger.info("handle message {} start" , message);
		try {
			//监听链
			for(IMQMessageHandler<T> handler : messageHandlers) {
				if(handler.support(message)) {
					handler.handle(message);
					break;
				}
			}
		} catch (Exception e) {
			logger.error("handle message {} error " , message , e);
		}
	}
	
	//监听器注册
	protected AbstractMQListener<T> registerHandler(IMQMessageHandler<T> handler) {
		this.messageHandlers.add(handler);
		return this;
	}
}
