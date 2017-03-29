package com.lyx.ag.power.data.template.support;

import org.dom4j.Document;
import org.dom4j.Element;

import com.lyx.ag.power.data.template.XMLTemplate;

public class DOM4JTemplateSupport implements XMLTemplate<Document> {

	@Override
	public boolean convert(Document doc) {
		// TODO Auto-generated method stub
		Element root = doc.getRootElement();
		root.getName();
		
		
		return false;
	}

	
	
	

}
