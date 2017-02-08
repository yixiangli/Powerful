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

import com.lyx.ag.power.io.iterator.AbstractIterator;

/**
 * @param <T>
 * @developer liyixiang
 * @Info
 * * * @company leEco
 * * * @email <liyixiang@le.com>
 * * * @Team smartConnected
 * @date 2017年2月8日
 * @since JDK 1.7
 * @Function
 * @Reason
 */
public class ListIterator<T> extends AbstractIterator<T> {

	private Iterator<T> iterator = null;
	
	public ListIterator(List<T> list) {
		// TODO Auto-generated constructor stub
		this.iterator = list.iterator();
		
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		try {
			return iterator.hasNext();
		} catch (NullPointerException e){
			
		} catch (Exception e){
			
		}
		return false;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		try {
			return iterator.next();
		} catch (NullPointerException e){
			
		} catch (Exception e){
			
		}
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		iterator.remove();
	}

}
