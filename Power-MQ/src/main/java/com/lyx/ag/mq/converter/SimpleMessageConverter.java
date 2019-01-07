package com.lyx.ag.mq.converter;

import java.io.Serializable;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.jms.support.converter.MessageConversionException;

import com.alibaba.fastjson.JSONObject;
import com.lyx.ag.power.converter.JsonConverter;

/**
 * 
 * @author liyixiang
 * @date 2017年3月15日
 * @use
 * 		简单消息转换器
 * 		支持TextMessage
 * 		支持ObjectMessage
 */
public class SimpleMessageConverter implements IMessageConverter {

	private static final String SIMPLE_MESSAGE = "simple_message";
	
	/**
	 * 将Message消息发送出去
	 */
	@Override
	public Message toMessage(Object object, Session session) throws JMSException, MessageConversionException {
		// TODO Auto-generated method stub
		//序列化对象
		if(object instanceof Serializable){
			return session.createObjectMessage((Serializable) object);
		}
		JSONObject data = new JSONObject();
		data.put(SIMPLE_MESSAGE, object);
		return session.createTextMessage(data.toJSONString());		
	}

	/**
	 * 从mq中获取Message消息
	 */
	@Override
	public Object fromMessage(Message message) throws JMSException,MessageConversionException {
		// TODO Auto-generated method stub
		if (message instanceof TextMessage) {
			return convertStrToObject((TextMessage) message);
		}else if (message instanceof ObjectMessage) {
			ObjectMessage om = (ObjectMessage) message;
			return om.getObject();
		}
		return message;
	}
	
	//这个方法可以优化，使用utils工具  将str转jsonObject隔离
	private Object convertStrToObject(TextMessage message) throws JMSException {
		return JsonConverter.strToObject(message.getText(),SIMPLE_MESSAGE);
	}

}
