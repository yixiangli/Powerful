/** 
 * @Project_Name Power-Utils 
 * @File_Name PowerException.java 
 * @Date 2017年2月8日下午11:43:38 
 * @Copyright(c) 2017, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.lyx.ag.power.exception;

/**
 * @developer liyixiang
 * @Info
 * @date 2017年2月8日
 * @since JDK 1.7
 * @Function	异常处理类
 * @Reason
 */
public class PowerException extends RuntimeException {

	/**
	 * @variable serialVersionUID
	 * @descriptor 
	 */
	private static final long serialVersionUID = 1L;

	public PowerException() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public PowerException(String msg){
		super(msg);
	}
	
	public PowerException(Throwable cause){
		super(cause);
	}
	
	public PowerException(String msg,Throwable cause){
		super(msg,cause);
	}
}
