package com.lyx.ag.power.lb;

import com.lyx.ag.power.lb.factory.LoadBalanceFactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.testOne();
	}
	
	
	public void testOne(){
		LoadBalanceFactory.getInstance().createLoadBalance("Random");
	}

}
