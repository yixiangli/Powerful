/** 
 * @Project_Name Power-IO 
 * @File_Name Test.java 
 * @Date 2017年2月8日下午11:17:36 
 * @Copyright(c) 2017, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.lyx.ag.power.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

import com.lyx.ag.power.io.iterator.support.BufferedReaderIterator;

/**
 * @developer liyixiang
 * @Info
 * @date 2017年2月8日
 * @since JDK 1.7
 * @Function
 * @Reason
 */
public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedReader brs = new BufferedReader(new InputStreamReader(bis,"UTF-8"), 10 * 1024 * 1024);
		BufferedReaderIterator br = new BufferedReaderIterator(brs);
		
	}

}
