package com.lyx.ag.power.data.xml.factory;

import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileFilter;

import com.lyx.ag.power.data.IXMLSelector;
import com.lyx.ag.power.data.annotation.Parser;
import com.lyx.ag.power.data.enumeration.ParserEnum;

/**
 * 
 * @author liyixiang
 * @date 2017年3月28日
 * @use
 * 		
 */
public class XMLFactory {

	/*
	 * 静态内部单例
	 * 
	 */
	
	private XMLFactory(){
		//初始化工厂
		init();
	}
	
	public static XMLFactory getInstance(){
		return SingleTonFactory.factory;
	} 
	
	private static class SingleTonFactory{
		static XMLFactory factory = new XMLFactory();
	}
	
	/*
	 * 属性
	 * 
	 */
	
    private List<Class<? extends IXMLSelector>> parserList;	//策略列表

    private ClassLoader classLoader = getClass().getClassLoader();//加载策略时的类加载器，任何类运行时信息必须来自该类加载器

	private static final String PACKAGE_NAME = "com.lyx.ag";
    
    /*
	 * 行为
	 * 
	 */
    
	private void init(){
		parserList = new ArrayList<Class<? extends IXMLSelector>>();
		File[] resources = getResources();//获取到包下所有的class文件
		Class<IXMLSelector> parserClazz = null;
        try {
        	parserClazz = (Class<IXMLSelector>) classLoader.loadClass(IXMLSelector.class.getName());//使用相同的加载器加载策略接口
        } catch (ClassNotFoundException e1) {
            throw new RuntimeException("未找到策略接口");
        }
        for (int i = 0; i < resources.length; i++) {
            try {
                //载入包下的类
                Class<?> clazz = classLoader.loadClass(PACKAGE_NAME + "."+resources[i].getName().replace(".class", ""));
                //判断是否是Parser的实现类并且不是Parser它本身，满足的话加入到策略列表
                if (Parser.class.isAssignableFrom(clazz) && clazz != parserClazz) {
                	parserList.add((Class<? extends IXMLSelector>) clazz);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
		
	}

	private File[] getResources() {
		// TODO Auto-generated method stub
		try {
            File file = new File(classLoader.getResource(PACKAGE_NAME.replace(".", "/")).toURI());
            return file.listFiles(new FileFilter() {
                public boolean accept(File pathname) {
                    if (pathname.getName().endsWith(".class")) {//我们只扫描class文件
                        return true;
                    }
                    return false;
                }
            });
        } catch (URISyntaxException e) {
            throw new RuntimeException("未找到策略资源");
        }
	}
	
	
	public IXMLSelector getParser(){
		//在策略列表查找策略
        for (Class<? extends IXMLSelector> clazz : parserList) {
        	Parser parser = handleAnnotation(clazz);//获取该策略的注解
        	//如果配置的是dom4j
        	if(parser.name().equals(ParserEnum.DOM4J)){
        		try {
					return clazz.newInstance();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					throw new RuntimeException("策略获得失败");
				}
        	}
        }
        throw new RuntimeException("策略获得失败");
	}
	
	/**
	 * 处理注解
	 * @param clazz
	 * @return
	 */
	private Parser handleAnnotation(Class<? extends IXMLSelector> clazz){
		Annotation[] annotations = clazz.getDeclaredAnnotations();
        if (annotations == null || annotations.length == 0) {
            return null;
        }
        for (int i = 0; i < annotations.length; i++) {
            if (annotations[i] instanceof Parser) {
                return (Parser) annotations[i];
            }
        }
        return null;
	}
	
}
