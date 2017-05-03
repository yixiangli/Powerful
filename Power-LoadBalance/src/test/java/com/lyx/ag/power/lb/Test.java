package com.lyx.ag.power.lb;

import java.util.ArrayList;
import java.util.List;

import com.lyx.ag.power.lb.factory.LoadBalanceFactory;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Thread.sleep(10000);
		
		Test test = new Test();
		for (int i=0;i<100000;i++){
			test.testTwo();
		}
		
		Thread.sleep(10000);
		
		for (int i=0;i<100000;i++){
			test.testTwo();
		}
	}
	
	
	public void testOne(){
		LoadBalance lb = LoadBalanceFactory.getInstance().createLoadBalance("Random");
		//System.out.println();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Integer i = lb.select(list);
		System.out.println(i);
	}

	
	public void testTwo(){
		LoadBalance lb = LoadBalanceFactory.getInstance().createLoadBalance("RoundRobin");
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Integer i = lb.select(list);
		System.out.println(i);
	}
}
