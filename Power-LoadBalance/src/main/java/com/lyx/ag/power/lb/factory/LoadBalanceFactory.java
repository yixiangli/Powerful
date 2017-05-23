package com.lyx.ag.power.lb.factory;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import com.lyx.ag.power.lb.LoadBalance;
import com.lyx.ag.power.lb.annotation.LBS;

/**
 * 
 * @author liyixiang
 * @date 2017年3月29日
 * @use
 * 		负载均衡工厂
 */
public class LoadBalanceFactory {

	//均衡策略列表
	private List<Class<? extends LoadBalance>> lbList; 
	//加载策略时的类加载器，任何类运行时信息必须来自该类加载器
	private ClassLoader classLoader = getClass().getClassLoader();
	//扫描策略的包
	private static final String ROOT_PACKAGE = "com.lyx.ag.power.lb.strategy";

	
	private LoadBalanceFactory(){
		init();
	}
	
	private static class Build {
		private static final LoadBalanceFactory factory = new LoadBalanceFactory();
	
		static LoadBalanceFactory build(){
			return factory;
		}
	}
	
	public static LoadBalanceFactory getInstance(){
		return Build.build();
	}

	//工厂加载策略初始化
	private void init(){
		lbList = new ArrayList<Class<? extends LoadBalance>>();
		//获取到包下所有的class文件
		File[] resources = getResources();
		
		//加载class
		Class<LoadBalance> lbClazz = null;
        try {
        	lbClazz = (Class<LoadBalance>) classLoader.loadClass(LoadBalance.class.getName());//使用相同的加载器加载策略接口
        } catch (ClassNotFoundException e1) {
            throw new RuntimeException("未找到策略接口");
        }
        
        for (int i = 0; i < resources.length; i++) {
            try {
                //载入包下的类
                Class<?> clazz = classLoader.loadClass(ROOT_PACKAGE + "."+resources[i].getName().replace(".class", ""));
                //判断是否是CalPrice的实现类并且不是CalPrice它本身，满足的话加入到策略列表
                if (LoadBalance.class.isAssignableFrom(clazz) && clazz != lbClazz) {
                	lbList.add((Class<? extends LoadBalance>) clazz);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
	}
	
	//获取扫描的包下面所有的class文件
	private File[] getResources(){
		try {
            File file = new File(classLoader.getResource(ROOT_PACKAGE.replace(".", "/")).toURI());
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
	
	/**
	 * 
	 * @param name 传入所采用的均衡策略
	 * @return
	 */
	public LoadBalance createLoadBalance(String name){
		//在策略列表查找策略
		for (Class<? extends LoadBalance> clazz : lbList){
			//获取该策略的注解
			LBS lbs = handleAnnotation(clazz);
			//匹配
			if(lbs.name().equals(name)){
				//匹配成功返回一个当前策略的实例
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
	 * 循环搜索均衡策略
	 * @param clazz
	 * @return
	 */
	private LBS handleAnnotation(Class<? extends LoadBalance> clazz){
		Annotation[] annotations = clazz.getDeclaredAnnotations();
        if (annotations == null || annotations.length == 0) {
            return null;
        }
        for (int i = 0; i < annotations.length; i++) {
            if (annotations[i] instanceof LBS) {
                return (LBS) annotations[i];
            }
        }
        return null;
	}
	
	
}
