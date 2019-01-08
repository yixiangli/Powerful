/** 
 * @Project_Name Power-IO 
 * @File_Name AbstractIterator.java 
 * @Date 2017年2月8日下午6:01:47 
 * @Copyright(c) 2017, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.lyx.ag.power.io.iterator;

import java.util.Iterator;

/**
 * @param <E>
 * @developer liyixiang
 * @Info
 * @date 2017年2月8日
 * @since JDK 1.7
 * @Function 迭代器模式
 * @Reason
 */
public abstract class AbstractIterator<E> implements Iterator<E> {

	@Override
	public abstract boolean hasNext();

	@Override
	public abstract E next() ;

	@Override
	public abstract void remove() ;

}
