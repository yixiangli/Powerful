package com.lux.ag.power.ds.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author liyixiang
 * @date 2017年5月23日
 * @use
 * 		二叉树的遍历
 */
public class BinaryTreeErgodic {

	private static List<Node> nodeList;
	
	/**
	 * 
	 * @param array 待构建二叉树的数组
	 */
	public void createBinTree(int array[]){
		nodeList = new LinkedList<Node>();
		
		//将数组赋值入链表
		for(int nodeIndex = 0;nodeIndex < array.length; nodeIndex++){
			nodeList.add(new Node(array[nodeIndex]));
		}
		
		for(int pIndex=0;pIndex<array.length/2-1;pIndex++){
			
			//左孩子
			nodeList.get(pIndex).leftChild = nodeList.get(pIndex*2+1);
			
			//右孩子
			nodeList.get(pIndex).rightChild = nodeList.get(pIndex*2+2);
		}
		//最后一个节点可能没有右孩子
		int lastPIndex = array.length/2-1;
		nodeList.get(lastPIndex).leftChild = nodeList.get(lastPIndex*2+1);
		if(array.length%2==1){
			nodeList.get(lastPIndex).rightChild = nodeList.get(lastPIndex*2+2);
		}
	}
	
	//先序遍历(根左右)
	public void preOrderTraverse(Node node){
		if (node == null)  
            return;  
		System.out.print(node.data + " ");  
        preOrderTraverse(node.leftChild);  
        preOrderTraverse(node.rightChild);  
	}
	
	//中序遍历(左根右)
	public void inOrderTraverse(Node node){
		if (node == null)  
            return;  
		inOrderTraverse(node.leftChild);  
        System.out.print(node.data + " ");  
        inOrderTraverse(node.rightChild);  
	}

	//后序遍历(左右根)
	public void postOrderTraverse(Node node){
		if (node == null)  
            return;  
		postOrderTraverse(node.leftChild);  
	    postOrderTraverse(node.rightChild);  
	    System.out.print(node.data + " ");
	}
	
}

/**
 * 
 * @author liyixiang
 * @date 2017年5月23日
 * @use 节点
 */
class Node {
	
	Node leftChild;
	Node rightChild;
	int data;
	
	public Node(int newData) {
		// TODO Auto-generated constructor stub
		leftChild = null;
		rightChild = null;
		this.data = newData;
	}
}
