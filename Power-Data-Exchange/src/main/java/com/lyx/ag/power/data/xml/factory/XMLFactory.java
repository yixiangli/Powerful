package com.lyx.ag.power.data.xml.factory;

/**
 * 
 * @author liyixiang
 * @date 2017年3月28日
 * @use
 * 		
 */
public class XMLFactory {

	private XMLFactory(){}
	
	public static XMLFactory getInstance(){
		return SingleTonFactory.factory;
	} 
	
	private static class SingleTonFactory{
		static XMLFactory factory = new XMLFactory();
	}
	
	
}
