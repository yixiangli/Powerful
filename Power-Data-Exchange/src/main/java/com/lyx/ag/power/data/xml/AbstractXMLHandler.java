package com.lyx.ag.power.data.xml;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

import org.dom4j.io.SAXReader;

import com.lyx.ag.power.data.IConverter;
import com.lyx.ag.power.data.IResourceReader;

/**
 * 
 * @author liyixiang
 * @date 2017年3月28日
 * @use
 * 		抽象xml处理者
 */
public abstract class AbstractXMLHandler<T> implements IConverter<T>,IResourceReader<T> {

	protected static SAXReader saxReader;
	
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
