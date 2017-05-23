package com.lyx.ag.algorithm.search;

/**
 * 
 * @author liyixiang
 * @date 2017年5月17日
 * @use
 * 		二分查找
 */
public class BinarySearch {

	/**
	 * 非递归
	 * @param a	待查找有序数组
	 * @param des 待查找的元素
	 * @return
	 * 		元素的下标
	 */
	public static int binarySearch(int a[],int des){
		int low = 0;
		int high = a.length - 1 ;
		
		while(low <= high){
			int middle = (low>>>1) + (high>>>1);	//右移1位			
			if(des == a[middle]){
				return middle;
			}else if(des < a[middle]){
				low = middle + 1 ;
			}else {
				high = middle - 1 ;
			}
		}
		return -1;
	}
	
	
	/**
	 * 递归
	 * @param a	待查找有序数组
	 * @param des	待查找的元素
	 * @param low	查找范围的左端
	 * @param high	查找范围的右端
	 * @return	
	 * 		元素的下标
	 */
	public static int binarySearch(int a[],int des,int low,int high){
		int middle = (low>>>1) + (high>>>1);
		//校验（面试心得：写算法不做任何校验，不挂你挂谁）
		if(des < a[low] || des > a[high] || low > high){
			return -1;
		}
		
		if(des > a[middle]){
			binarySearch(a,des,middle+1,high);
		}else if(des < a[middle]){
			binarySearch(a,des,low,middle-1);
		}else {
			return middle;
		}
		return -1;
	}
}
