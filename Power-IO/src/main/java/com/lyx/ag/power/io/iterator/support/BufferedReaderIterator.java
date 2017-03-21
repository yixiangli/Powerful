/** 
 * @Project_Name Power-IO 
 * @File_Name FileIterator.java 
 * @Date 2017年2月8日下午6:05:05 
 * @Copyright(c) 2017, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.lyx.ag.power.io.iterator.support;

import java.io.BufferedReader;
import java.io.IOException;

import com.lyx.ag.power.exception.PowerException;
import com.lyx.ag.power.io.iterator.AbstractIterator;
import com.lyx.ag.power.utils.NPEUtils;

/**
 * @developer liyixiang
 * @Info
 * * * @company leEco
 * * * @email <liyixiang@le.com>
 * * * @Team smartConnected
 * @date 2017年2月8日
 * @since JDK 1.7
 * @Function 字符流迭代器
 * 				 E:String
 * @Reason
 */
public class BufferedReaderIterator extends AbstractIterator<String> {

	private BufferedReader reader = null;
	
	public BufferedReaderIterator(BufferedReader bfr) {
		// TODO Auto-generated constructor stub
		if(NPEUtils.isNull4Obj(bfr)){
			throw new PowerException();
		}	
		this.reader = bfr;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		try {
			return reader.ready();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		return false;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		try {
			return reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
