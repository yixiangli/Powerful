package com.lyx.ag.power.data;

/**
 * 
 * @author liyixiang
 * @date 2017年3月28日
 * @use
 * 		转换接口
 */
public interface IConverter<T> {

	/**
	 * 
	 * @param doc 
	 * 			  待转换的对象
	 * @return
	 * 			  转换是否成功
	 */
	boolean parse(T doc);
}
