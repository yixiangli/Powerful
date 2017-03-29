package com.lyx.ag.power.data.template;

/**
 * 
 * @author liyixiang
 * @date 2017年3月29日
 * @use
 * 		xml模版
 */
public interface XMLTemplate<T> {

	public boolean convert(T doc);
}
