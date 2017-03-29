package com.lyx.ag.power.data.xml;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

import com.lyx.ag.power.data.IXMLParser;

/**
 * 
 * @author liyixiang
 * @date 2017年3月28日
 * @use
 * 		抽象xml处理者
 */
public abstract class AbstractXMLParser<T> implements IXMLParser<T> {

	@Override
	public T getResource(URL url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getResource(File file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getResource(InputStream stream) {
		// TODO Auto-generated method stub
		return null;
	}

}
