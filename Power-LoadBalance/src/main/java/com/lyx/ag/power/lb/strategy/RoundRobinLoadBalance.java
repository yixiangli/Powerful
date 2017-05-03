package com.lyx.ag.power.lb.strategy;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.lyx.ag.power.lb.AbstractLoadBalance;
import com.lyx.ag.power.lb.LoadBalance;
import com.lyx.ag.power.lb.annotation.LBS;

/**
 * 
 * @author liyixiang
 * @date 2017年5月3日
 * @use 轮询
 */
@LBS(name="RoundRobin")
public class RoundRobinLoadBalance extends AbstractLoadBalance{

	private static AtomicInteger index = new AtomicInteger();
	
	//start -------- 单例 --------
	private RoundRobinLoadBalance(){}
	
	private static class Builder {
		private static final RoundRobinLoadBalance roundRobinLBS = new RoundRobinLoadBalance();
	
		static LoadBalance build(){
			return roundRobinLBS;
		}
	}
	
	public static LoadBalance getInstance(){
		return Builder.build();
	}
	//end -------- 单例 --------
	
	@Override
	public <T> T doSelect(List<T> list) {
		// TODO Auto-generated method stub
		return list.get(index.getAndIncrement());
	}

}
