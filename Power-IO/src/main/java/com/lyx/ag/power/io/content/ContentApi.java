/** 
 * @Project_Name Power-IO 
 * @File_Name ContentApi.java 
 * @Date 2017年2月8日下午5:19:43 
 * @Copyright(c) 2017, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.lyx.ag.power.io.content;

import java.util.Iterator;

/**
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
public interface ContentApi {
	
	/* 
	 * 内容按行读取
	 * 参数 
	 * 		1.文件路径
	 * 	
	 * 返回
	 * 		各种迭代器
	 * 		1. 文件类型迭代器
	 * 		2. 流类型迭代器
	 * 		3. 集合类型迭代器
	 */
	public <E> Iterator<E> readLine(String filePath);
	
	/*
	 * 内容按行 每行按分割符读取
	 * 参数
	 * 		1.文件路径
	 * 		2.分隔符
	 */
	
	
	/*
	 * 文件按行写入
	 */
	public void writeLine();
	
	/*
	 * 文件内容提取复制到另一个文件
	 */
}
