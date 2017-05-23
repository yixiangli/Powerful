package com.lyx.ag.algorithm.sort;

public class BubbleSort {

	/**
	 * 
	 * 方法概述：
	 * 		冒泡排序实现
	 * 参数：
	 * 		待排序数组
	 * 返回值：
	 * 		无，直接打印数组
	 */
	public void bubbleSort(int data[]){
		
		System.out.println("排序前：");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]);
		}
		
		/**
		 * 核心算法
		 * 编码时误将j+1写为i 排序出问题！
		 * 		原因：相当于第一个元素依次与后面元素比较，如果大交换，但是之后第一个元素
		 * 变为了小元素，再继续与后面元素交换，第二轮排序较大元素又交换回第一位!
		 * 但是注意：
		 * 		这种写法的最好情况时间复杂度依然为O（n^2）
		 */
		for(int i=0;i<data.length-1;i++){
			for(int j=0;j<data.length-i-1;j++){
				if(data[j]>data[j+1]){
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp; 
				}
			}
		}
		
		System.out.println();
		System.out.println("排序后：");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]);
		}	
	}
	
	/**
	 * 
	 * 方法概述：
	 * 		冒泡排序进阶版
	 * 参数：
	 * 		待排序数组
	 * 返回值：
	 */
	public void bestBubbleSort(int data[]){
		
		System.out.println("排序前：");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]);
		}
		
		/**核心算法
		*且最好情况下（也就是正序）时间复杂度为O(n)
		*	加一个标识意味着判断这次交换是否进行了，也就是说
		*在一次i循环中如果没有数据交换说明整个数组已经完成了排序
		*之后的循环就可以不进行了！减小了时间复杂度
		*/
		boolean didSwap;
		for(int i=0;i<data.length-1;i++){
			didSwap = false;      //是否进行了交换
			for(int j=0;j<data.length-i-1;j++){
				if(data[j]>data[j+1]){
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp; 
					didSwap = true;
				}
			}
			
			if(didSwap == false){
				return;
			}
		}
				
		System.out.println();
		System.out.println("排序后：");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]);
		}	
	}
	

	public static void main(String[] args) {
		int array[] = {9,1,2,4,3,5,8,8,7};
		new BubbleSort().bestBubbleSort(array);
	}
	
}
