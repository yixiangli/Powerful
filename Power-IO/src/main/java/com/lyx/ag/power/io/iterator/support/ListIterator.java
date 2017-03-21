/** 
 * @Project_Name Power-IO 
 * @File_Name ListIterator.java 
 * @Date 2017年2月8日下午9:58:42 
 * @Copyright(c) 2017, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.lyx.ag.power.io.iterator.support;

import java.util.Iterator;
import java.util.List;

import com.lyx.ag.power.exception.PowerException;
import com.lyx.ag.power.io.iterator.AbstractIterator;
import com.lyx.ag.power.utils.NPEUtils;

/**
 * @param <T>
 * @developer liyixiang
 * @Info
 * @date 2017年2月8日
 * @since JDK 1.7
 * @Function
 * @Reason
 */
public class ListIterator<T> extends AbstractIterator<T> {

	private Iterator<T> iterator = null;
	
	public ListIterator(List<T> list) {
		// TODO Auto-generated constructor stub
		if(NPEUtils.isNull4Obj(list.iterator())){
			throw new PowerException("param is null");
		}
		this.iterator = list.iterator();
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return iterator.hasNext();
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return iterator.next();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		iterator.remove();
	}

}
