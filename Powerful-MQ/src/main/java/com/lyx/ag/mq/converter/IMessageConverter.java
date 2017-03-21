package com.lyx.ag.mq.converter;

import org.springframework.jms.support.converter.MessageConverter;

/**
 * 
 * @author liyixiang
 * @date 2017年3月14日
 * @use
 * 		基于spring MessageConverter接口做接口扩展
 * 		实现类均实现MessageConverter的自定义子接口，增强扩展性
 * 		可实现支持
 			Text message : javax.jms.TextMessage，表示一个文本对象。
			Object message : javax.jms.ObjectMessage，表示一个JAVA对象。
			Bytes message : javax.jms.BytesMessage，表示字节数据。
			Stream message :javax.jms.StreamMessage，表示java原始值数据流。
			Map message : javax.jms.MapMessage，表示键值对。
 */
public interface IMessageConverter extends MessageConverter {

	
}
