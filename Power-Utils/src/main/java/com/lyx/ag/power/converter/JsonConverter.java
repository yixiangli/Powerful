package com.lyx.ag.power.converter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 
 * @author liyixiang
 * @date 2017年3月20日
 * @use
 * 		json转换工具类
 */
public class JsonConverter {

	/**
	 * 
	 * @param str 待转换的json字符
	 * @param obj jsonObject中的key
	 * @return 转换后的Object
	 */
	public static Object strToObject(String str,Object obj){
		JSONObject jsonObject = JSON.parseObject(str);
		return jsonObject.get(obj);
	}
	
}
