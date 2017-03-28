package com.lyx.ag.power.data.xml;

import java.net.URL;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 
 * @author liyixiang
 * @date 2017年3月28日
 * @use
 * 		dom4j实现
 */
public class Dom4JHandler extends AbstractXMLHandler<Document> {

	private Logger logger = LoggerFactory.getLogger(Dom4JHandler.class);
	
	public Dom4JHandler() {
		// TODO Auto-generated constructor stub
		saxReader = new SAXReader();
	}

	@Override
	public Document getResource(URL url) {
		// TODO Auto-generated method stub
		Document doc = null;
		try {
			doc = saxReader.read(url);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			logger.error("dom4j for reader url error ",e);
		}
		return doc;
	}
	
	@Override
	public boolean parse(Document doc) {
		// TODO Auto-generated method stub
		//doc.getRootElement();
		return false;
	}

	

	

}
