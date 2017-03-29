package com.lyx.ag.power.data.enumeration;

public enum ParserEnum {

	DOM("dom"),SAX("sax"),DOM4J("dom4j"),JDOM("jdom");
	
	private String name;
	
	private ParserEnum(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
