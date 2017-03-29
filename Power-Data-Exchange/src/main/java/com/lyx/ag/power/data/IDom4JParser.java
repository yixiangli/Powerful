package com.lyx.ag.power.data;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lyx.ag.power.data.xml.Dom4JParser;

/**
 * 
 * @author liyixiang
 * @date 2017年3月29日
 * @use
 * 		dom4j解析器
 */
public abstract class IDom4JParser implements IXMLParser<Document> {

	protected static SAXReader reader;
	
	private Logger logger = LoggerFactory.getLogger(Dom4JParser.class);
	
	public IDom4JParser() {
		// TODO Auto-generated constructor stub
		 reader = new SAXReader();
	}
	
	@Override
	public Document getResource(File file) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Document getResource(URL url) {
		// TODO Auto-generated method stub
		Document doc = null;
		try {
			doc = reader.read(url);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			logger.error("dom4j for reader url error ",e);
		}
		return doc;
	}
	
	@Override
	public Document getResource(InputStream stream) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 自行实现解析方法
	 */
	@Override
	public abstract boolean parse(Document doc);
}
