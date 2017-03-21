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

	public static Object strToObject(String str,Object obj){
		JSONObject jsonObject = JSON.parseObject(str);
		return jsonObject.get(obj);
	}
	
	
	
}
