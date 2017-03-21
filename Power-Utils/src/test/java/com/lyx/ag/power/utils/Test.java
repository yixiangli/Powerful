/** 
 * @Project_Name Power-Utils 
 * @File_Name Test.java 
 * @Date 2017年2月8日下午11:04:07 
 * @Copyright(c) 2017, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.lyx.ag.power.utils;

/**
 * @developer liyixiang
 * @Info
 * @date 2017年2月8日
 * @since JDK 1.7
 * @Function
 * @Reason
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(ObjectUtils.isNull("1","2",null));
		//egg();
		for(int i=0;i<1000000;i++){
			egg(i);
		}
	}

	public static int egg(int x){
		if(x%1 == 0 && x%2 == 1 && x%3 == 0 && x%4 == 1 && x%5 == 4 && x%6 == 3 && x%7 == 0 && x%8 == 1 && x%9 == 0){
			System.out.println(x);
		}
		return x;
	}

}
