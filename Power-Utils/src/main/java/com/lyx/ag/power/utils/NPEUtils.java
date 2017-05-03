/** 
 * @Project_Name Power-Utils 
 * @File_Name Utils.java 
 * @Date 2017年2月8日下午10:55:52 
 * @Copyright(c) 2017, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.lyx.ag.power.utils;

/**
 * @developer liyixiang
 * @Info
 * @date 2017年2月8日
 * @since JDK 1.7
 * @Function NPE工具类
 * @Reason
 */
public class NPEUtils {

	/**
	 * 
	 * @author liyixiang
	 * @date 2017年2月8日 下午11:41:12
	 * @descriptor 字符串组判空 
	 * @param param
	 * @return	是空
	 */
	public static boolean isNull4Str(String... param){
		for(String str : param){
			if(null != str){
				return false;
			}
		}
		return true;
	}
	
	
	/**
	 * 
	 * @author liyixiang
	 * @date 2017年2月8日 下午11:41:45
	 * @descriptor  对象组判空
	 * @param param
	 * @return  是空
	 */
	public static boolean isNull4Obj(Object... param){
		for(Object obj : param){
			if(null != obj){
				return false;
			}
		}
		return true;
	}
	
	
	
	/**
	 * 
	 * @author liyixiang
	 * @date 2017年2月8日 下午11:38:26
	 * @descriptor 字符串组判空
	 * @param param
	 * @return  不是空
	 */
	public static boolean isNotNull4Str(String... param){
		for(String str : param){
			if(null == str){
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * @author liyixiang
	 * @date 2017年2月8日 下午11:38:46
	 * @descriptor 对象组判空
	 * @param param
	 * @return  不是空
	 */
	public static boolean isNotNull4Obj(Object... param){
		for(Object obj : param){
			if(null == obj){
				return false;
			}
		}
		return true;
	}
	
	
	
}
