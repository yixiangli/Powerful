/** 
 * @Project_Name Power-IO 
 * @File_Name FileContent.java 
 * @Date 2017年2月8日下午3:51:35 
 * @Copyright(c) 2017, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.lyx.ag.power.io.content;

import java.io.File;

/**
 * @developer liyixiang
 * @Info
 * @date 2017年2月8日
 * @since JDK 1.7
 * @Function 
 * @Reason
 */
public interface FileApi {

	/**
	 * 
	 * @author liyixiang
	 * @date 2017年2月9日 上午10:06:39
	 * @descriptor 将源文件的内容原封不动的copy到目标文件中
	 * @param sourceFile 源文件
	 * @param targetFile 目标文件
	 * @return
	 */
	public File copyFile(String sourceFile,String targetFile); 
	
	
	/**
	 * 
	 * @author liyixiang
	 * @date 2017年2月9日 上午10:08:32
	 * @descriptor	将源文件的内容中包含sign的提取到目标文件中
	 * @param sourceFile	源文件
	 * @param targetFile	目标文件
	 * @param sign	待提取的字符串
	 * @return
	 */
	public File copyFileBySign(String sourceFile,String targetFile,String sign);
	
	
	
	/**
	 * 
	 * @author liyixiang
	 * @date 2017年2月9日 上午10:17:12
	 * @descriptor 将目标文件中的str替换成sign
	 * @param targetFile	
	 * @param sign	替换后的字符串
	 * @param str	待替换的字符串
	 * @return
	 */
	public File replaceSignByFile(String targetFile,String str,String sign);
	
	
	
}
