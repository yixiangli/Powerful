package com.lyx.ag.power.data;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

/**
 * 
 * @author liyixiang
 * @date 2017年3月28日
 * @use
 * 		资源读取接口
 */
public interface IResourceReader<T> {

	/**
	 * @param url 
	 * 			  网络url地址
	 * @return 返回待转换的对象
	 */
	T getResource(URL url);
	
	/**
	 * @param url 
	 * 			  本地文件路径
	 * @return 返回待转换的对象
	 */
	T getResource(File file);
	
	/**
	 * @param url 
	 * 			  输入流stream
	 * @return 返回待转换的对象
	 */
	T getResource(InputStream stream);
}
