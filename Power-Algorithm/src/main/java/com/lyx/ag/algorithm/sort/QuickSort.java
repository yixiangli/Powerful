package com.lyx.ag.algorithm.sort;

public class QuickSort {

	/**
	 * 
	 * 方法概述：
	 * 参数：
	 * 返回值：
	 */
	public void quickSort(int data[],int start,int end){
		int pivot = start;        //作为中间元素
		int i = start + 1;       //左边索引
		int j = end;             //右边索引
		
		while(true){
			
			if (start >= end)      //判断左右端是否排序完毕，防止出现数组越界异常
	            return; 
			
			/*
			 * 双向指针向中间聚集
			 */
			while(i <= end && data[i] < data[pivot]){
				i++;
			}
			
			while(j > start && data[j] > data[pivot]){
				j--;
			}
			
			//交换元素
			if(i < j){
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}else {
				break;
			}
			
		}
		
		//交换到中间位置 形成左端比其小，有端比其大
		int temp = data[start];
		data[start] = data[j];
		data[j] = temp;
		
		quickSort(data,start,j-1);       //中间值左序列排序
		quickSort(data,j+1,end);         //中间值右序列排序
	}
	
	
	public static void main(String[] args) {
		
		int data[] = {3,6,4,1,2,5,7};
		new QuickSort().quickSort(data, 0, data.length-1);
		
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]);
		}
	}
	
}
